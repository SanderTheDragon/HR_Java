#!/usr/bin/python
#coding=utf8

# Copyright © SanderTheDragon (Sander Wolswijk)

import sys

for arg in sys.argv:
	print "Reading file \'" + arg + "\'"
	
	file_ = open(arg).read().splitlines()
	
	className = ""
	
	lines = []
	
	for line in file_:
		lines.append(line)
		
		line = line.strip()
		
		if (line.startswith("public") or line.startswith("private") or line.startswith("protected")) and (not ";" in line or "{" in line):
			if not "(" in line and not ")" in line:
				if className is "":
					post = lines[-1]
					del lines[-1]
					
					lines.append("/**")
					
					className = line.split(" ")[2]
					
					lines.append(" * @author  Firstname Lastname <email@mail.com>")
					lines.append(" * @version 1.0")
					
					lines.append(" */")
					lines.append(post)
			else:
				if not ("set" in line and " = " in line) and not ("get" in line and "return" in line):
					post = lines[-1]
					del lines[-1]
					
					lines.append("\t/**")
					
					if "{" in line:
						line = line[0:line.find("{") - 1]
					
					parts = line.split(" ")
					
					params = []
					
					if not "()" in line:
						params = line.split(", ")
						params[0] = params[0][params[0].find("(") + 1:]
						params[-1] = params[-1][:params[-1].find(")")]
					
					if parts[1][0:parts[1].find("(")] == className:
						lines.append("\t * Constructor for \'" + className + "\'")
						lines.append("\t <p>")
						lines.append("\t * ...")
						
						if params:
							lines.append("\t * ")
						
							for param in params:
								lines.append("\t * @param " + "{0: <{l}}".format(param.split(" ")[1], l=str(len(max(params, key=len)))) + " ... (as " + param.split(" ")[0] + ")")
					else:
						static = False
						
						functionReturn = parts[1]
						functionName = parts[2][0:parts[2].find("(")]
						
						if functionReturn == "static":
							static = True
							functionReturn = parts[2]
							functionName = parts[3][0:parts[3].find("(")]
						
						if functionReturn == "void" and functionName == "main" and static == True:
							lines.append("\t * Main method for \'" + className + "\'")
							lines.append("\t <p>")
						
						lines.append("\t * ...")
						
						if params:
							lines.append("\t * ")
						
							for param in params:
								lines.append("\t * @param " + "{0: <{l}}".format(param.split(" ")[1], l=str(len(max(params, key=len)) + 1)) + " ... (as " + param.split(" ")[0] + ")")
						
						if not functionReturn == "void":
							lines.append("\t * ")
							lines.append("\t * @return " + "{0: <{l}}".format("", l=str(len(max(params, key=len)))) + " ... (as " + functionReturn + ")")
					
					lines.append("\t */")
					lines.append(post)
		else:
			if line.startswith("public") or line.startswith("private") or line.startswith("protected"):
				post = line
				del lines[-1]
				
				lines.append("\t/**")
				
				if "=" in line:
					varValue = line[line.find("=") + 2:line.find("(")]
					varDecl = line[0:line.find("=") - 1]
					
					parts = varDecl.split(" ")
					
					varName = parts[-1]
					del parts[-1]
					
					varType = " ".join(parts)
					
					lines.append("\t * Declares \'" + varName + "\' as \'" + varType + "\' and intializes it as \'" + varValue + "\'")
				else:
					varDecl = line[0:line.find(";")]
					
					parts = varDecl.split(" ")
					
					varName = parts[-1]
					del parts[-1]
					
					varType = " ".join(parts)
					
					lines.append("\t * Declares \'" + varName + "\' as \'" + varType + "\'")
				
				lines.append("\t */")
				lines.append("\t" + post)
	
	print "Done"
	
	file_ = open(arg, "w")
	file_.truncate()
	
	for line in lines:
		file_.write(line + "\n")
