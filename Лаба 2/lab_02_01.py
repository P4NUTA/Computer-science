'''
 Условия
'''
# if..else
# num = int(input("How many times have you been to the Hermitage?"))
# if num > 0:
#     print("Wonderful!")
#     print("I hope you liked this museum!")
# else:
#     print("You should definitely visit the Hermitage!")
# # if..elif..else
# course = int(input("What is your course number?"))
# if course == 1:
#     print("You are just at the beginning!")
# elif course == 2:
#     print("You learned many things, but not all of them!")
# elif course == 3:
#     print("The basic course is over, it's time for professional disciplines!")
# else:
#     print("Oh! You need to hurry! June is the month of thesis defense")
# x = 5
# y = 12
# if y % x > 0:
#     print("%d cannot be evenly divided by %d" % (y, x))
# z = 3
# x = "{} is a divider of {}".format(z, y) if y % z == 0 else "{} is not a divider of {}".format(z, y)
# print(x)
print("\n\n")

# 2 point
p = int(input("Сколько лаб сделал?"))
if p > 10:
    print("Молодец")
else:
    print("Старайся")

# 3 point

a = 157
b = 525

if a>b:
    print(a%b)
elif a<b:
    print(b%a)
elif a==b:
    print(a*b)
