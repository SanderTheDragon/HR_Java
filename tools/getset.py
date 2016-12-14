#!/usr/bin/python
#coding=utf8

# Copyright © SanderTheDragon (Sander Wolswijk)

import sys

for arg in sys.argv:
	print "Reading file \'" + arg + "\'"
	
	file_ = open(arg).read().splitlines()
	
	lines = []
	nlines = []
	varList = []
	
	className = ""
	
	i = 0;
	
	prev = False
	
	for line in file_:
		lines.append(line)
		
		line = line.strip()
		
		if line.startswith("public class"):
			className = line.split(" ")[2]
		
		if line.startswith("private") and not "(" in line:
			varType = line.split(" ")[1]
			varName = line.split(" ")[2].replace(";", "")
			
			if varType == "final":
				varType = line.split(" ")[2]
				varName = line.split(" ")[3].replace(";", "")
			
			print "Found variable \'" + varName + "\' of type \'" + varType + "\'"
			
			nlines.append("\t")
			nlines.append("\tpublic " + varType + " get" + varName.title() + "() { return " + varName + "; }")
			nlines.append("\tpublic void set" + varName.title() + "(" + varType + " new" + varName.title() + ") { " + varName + " = new" + varName.title() + "; }")
			varList.append(varType + " " + varName)
			
			i = i + 1
			
			prev = True
		else:
			if prev is True:
				post = lines[-1]
				del lines[-1]
				
				for line_ in nlines:
					lines.append(line_)
				
				varListS = "";
				
				for var in varList:
					varListS += var.split(" ")[0] + " new" + var.split(" ")[1].title() + ", "
				
				varListS = varListS[0:len(varListS) - 2]
				
				lines.append("")
				lines.append("\tpublic " + className + "(" + varListS + ")")
				lines.append("\t{")
				
				for var in varList:
					lines.append("\t\t" + var.split(" ")[1] + " = new" + var.split(" ")[1].title() + ";")
				
				lines.append("\t}")
				
				lines.append(post)
				
				prev = False
	
	file_ = open(arg, "w")
	file_.truncate()
	
	for line in lines:
		file_.write(line + "\n")
	
	print "Wrote " + str(i) + " get/set method pairs"
	
