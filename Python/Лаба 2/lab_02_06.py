# 15 point
number = int(input())
buf = bin(number)

final = bin(~number&0xFF)[2:].zfill(0)
final = int(final,2)
final += 1
final = bin(final)[2:].zfill(0)

print(final)
