'''
 Форматированный ввод/вывод данных
'''
m = 10
pi = 3.1415927
print("m = ",m)
print("m = %d" % m)
print("%7d" % m)
print("pi = ", pi)
print("%.3f" % pi)
print("%10.4f\n" % pi)
print("m = {}, pi = {}".format(m,pi))
ch = 'A'
print("ch = %c" % ch)
s = "Hello"
print("s = %s" % s)
print("\n\n")
code = input("Enter your position number in group: ")
n1, n2 = input("Enter two numbers splitted by space: ").split()
d, m, y = input("Enter three numbers splitted by \'.\':").split('.')
print("{} + {} = {}".format(n1,n2,float(n1)+float(n2)))
print("Your birthday is %s.%s.%s and you are %d in the grouplist" % (d,m,y,int(code)) )

# Пункт 16
print("m = %4d" % int(m))
print("pi = %.3f" % pi)

# Пункт 17
print("m = {}, pi = {}".format(m, pi))

# Пункт 18
year = input("Введите ваш курс: ")
print("Курс: ", year)

# Пункт 19
r1 = input("Введите ваши баллы по русскому: ")
m1 = input("Введите ваши баллы по математике: ")
p1 = input("Введите ваши баллы по информатике: ")
print("Кол-во ваших баллов по русскому:", r1)
print("Кол-во ваших баллов по математике:", m1)
print("Кол-во ваших баллов по информатике:", p1)

# Пункт 20
numb_in = input("Введите 12 разрядное число (4СС): ")
print(int(numb_in, 4))

# Пункт 21
numb_in = int(input("Введите число: "))
print(numb_in>>1)
print(numb_in<<1)
