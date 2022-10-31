# Write a program that asks the user to enter their name and their age.
# Print out a message addressed to them that tells them the year that they will turn 100 years old.


UserName= input("please enter your name: ")
Age= int(input("please enter your age: "))
year = str( ( 2022 - Age ) + 100 )
print( UserName + " will be 100 years old in the year " + year )
