# Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5
# Bonus points if you can make the user enter their own tuple.


Tuple1=tuple(input("enter the list of the values").split(","))
print(Tuple1)
for value in Tuple1:
    if int(value)%5==0:
        print(value)