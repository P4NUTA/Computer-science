# A = 10
# B = 11
number = int(input(), 12)
print("number = ",number)
convert = 14
final = ''
while number > 0:
    if number % convert < 10:
        final = str(number % convert) + final
    elif number % convert == 10:
        final = 'A' + final
    elif number % convert == 11:
        final = 'B' + final
    elif number % convert == 12:
        final = 'C' + final
    elif number % convert == 13:
        final = 'D' + final
    number = number // convert
print(final)


