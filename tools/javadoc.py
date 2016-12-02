#!/usr/bin/python
#coding=utf8

# Copyright © SanderTheDragon (Sander Wolswijk)

import sys

print "Reading file \'" + sys.argv[1] + "\'"

file_ = open(sys.argv[1]).read().splitlines()

className = ""

lines = []

for line in file_:
	lines.append(line)
	
	line = line.strip()
	
	if (line.startswith("public") or line.startswith("private")) and not "=" in line:
		if not "(" in line and not ")" in line:
			if className is "":
				post = lines[-1]
				del lines[-1]
				
				lines.append("/**")
				
				className = line.split(" ")[2]
				
				lines.append(" * @author  FirstName LastName <email@email.com>")
				lines.append(" * @version 1.0")
				
				lines.append(" */")
				lines.append(post)
		else:
			if "set" not in line and "get" not in line:
				post = lines[-1]
				del lines[-1]
				
				lines.append("\t /**")
				
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
					lines.append("\t * ...")
					
					if params:
						lines.append("\t * ")
					
						for param in params:
							lines.append("\t * @param " + "{0: <10}".format(param.split(" ")[1]) + " ...")
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
					
					lines.append("\t * ...")
					
					if params:
						lines.append("\t * ")
					
						for param in params:
							lines.append("\t * @param " + "{0: <10}".format(param.split(" ")[1]) + " ...")
					
					if not functionReturn == "void":
						lines.append("\t * ")
						lines.append("\t * @return " + "{0: <10}".format("") + " ...")
				
				lines.append("\t */")
				lines.append(post)

print "Done"

file_ = open(sys.argv[1], "w")
file_.truncate()

for line in lines:
	file_.write(line + "\n")
