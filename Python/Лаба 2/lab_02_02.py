'''
 Циклы
'''
# while
print("Numbers < 10 (while):")
i = 0
while (i<10):
    print(i, end=" ") # print in one line
    i += 1
print("\n")
# for
print("Numbers < 10 (for):")
for i in range(0,10):
 print(i, end=" ")
else:
 print("\nThe next number is 10\n")
# break
sum = 0
for i in range(0, 100):
    if i > 10:
        print("\nWe reached the end, final sum: ", sum)
        break
    sum += i
# continue
i = 0
while i<=15:
    if i % 3 == 0:
        i += 1
        continue
    print(i, end=" ")
    i+=1
print("\n")
# pass
print("Let's print numbers again!")
for i in range(0,10):
    pass
    print(i, end=" ")
print("\n\n")
# 5 point + 6 point
for i in range(0,500,7):
        if not (i%14==0):
            if i<300:
                print(i)
            if i>300:
                break
i = 0
while i <500:
    if not (i%14==0):
        if i<300:
            print(i)
        elif i>300:
            break
    i += 7
print("\n")
# 7 point
i = 0
j = 0
for i in range(1,5):
    for j in range(1,5):
        if i == j:
            print(i, end=" ")
        elif i != j:
            print(0, end=" ")
    print("\n")