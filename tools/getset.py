#!/usr/bin/python
#coding=utf8

import sys

for arg in sys.argv:
	print "Reading file \'" + arg + "\'"
	
	file_ = open(arg).read().splitlines()
	
	lines = []
	nlines = []
	
	i = 0;
	
	prev = False
	
	for line in file_:
		lines.append(line)
		
		line = line.strip()
		
		if line.startswith("private") and not "(" in line:
			varType = line.split(" ")[1];
			varName = line.split(" ")[2].replace(";", "");
			
			print "Found variable \'" + varName + "\' of type \'" + varType + "\'"
			
			nlines.append("\t")
			nlines.append("\tpublic " + varType + " get" + varName.title() + "() { return " + varName + "; }")
			nlines.append("\tpublic void set" + varName.title() + "(" + varType + " new" + varName.title() + ") { " + varName + " = new" + varName.title() + "; }")
			
			i = i + 1
			
			prev = True
		else:
			if prev is True:
				post = lines[-1]
				del lines[-1]
				
				for line_ in nlines:
					lines.append(line_)
				
				lines.append(post)
				
				prev = False
	
	file_ = open(arg, "w")
	file_.truncate()
	
	for line in lines:
		file_.write(line + "\n")
	
	print "Wrote " + str(i) + " get/set method pairs"
	
