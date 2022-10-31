#Given a two list of numbers create a new list such that new list should contain only odd numbers from the first list and even numbers from the second list.



list1=list(input("please enter the first list numbers: ").split(", "))
list2=list(input("please enter the second list numbers: ").split(","))
list3=list()
for number in list1:
    if int(number)%2 != 0:
        list3.append(number)

for number in list2:
    if int(number)%2==0:
        list3.append(number)

# print(num for num in list3)

print(list3)

# for number in list3:
#     print(number, end=" ")
