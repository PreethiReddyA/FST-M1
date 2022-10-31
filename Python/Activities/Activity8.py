# Given a list of numbers, return True if first and last number of a list is same.
# Bonus points if you can make the user enter their own list.


numbers=list(input("Please enter the list of numbers: ").split(", "))
size=int(len(numbers))
print(size)
if numbers[0]==numbers[size-1]:
    print("True:First and Last numbers are same in the list")
else:
    print("they are not same")
