import random

coffee = random.randint(0, 10)

def showSupply():
	global coffee
	print("*Coffee supply at " + str(coffee) + ".*")

def goToStarbucks():
	global coffee
	print("*Drives all the to Augusta to get frappe.*")
	print("*Returns from Augusta.*")

	coffee += 10

	showSupply()

def codeOn():
	print("*Coffee supply all good!*")
	print("*I can now finish my Python Modules.*")

	showSupply()

if (coffee <= 5):
	goToStarbucks()
else:
	codeOn()