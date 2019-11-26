'''
 Списки
'''
a = [1,2,3,4,5]
print("a[0]: ", a[0])
print("List a[0:5]: ", a[0:5])
print("List a[:]: ", a[:])
print("List a: ", a)
print("List a[1:5]: ", a[1:])
print("List a[0:4]: ", a[:4])
print("Length of list a: ", len(a))
print("\nList a (by index):")
# получение элементов списка в цикле (1)
for i in range(0,len(a)):
    print(a[i], end=" ")
print("\nList a (by elements):")
# получение элементов списка в цикле (2)
for elem in a:
    print(elem, end=" ")
print("\n")
b = []
b.append(20) # добавление элемента в конец
b.extend(a) # добавление элементов списка a в b
'''Также внутри циклов могут быть использованы следующие ключевые слова:
 break – остановка цикла
 continue – переход на следующую итерацию цикла
 pass – не несет смыслового значения, может быть использован для упрощения
идентификации части кода, которую необходимо дополнить позже'''
print("List b (extended): ",b)
b.insert(3,5) # добавить элемент на позицию
print("List b (insert element): ",b)
b.remove(5) # удалить первый элемент, равный 5
print("List b (remove element): ",b)
c1 = b.pop() # удалить и вернуть последний элемент
print("List b (pop last element): ",b)
print("c1: ",c1)
c2 = b.pop(3) # удалить и вернуть эл. с позиции
print("List b (pop 3rd element): ",b)
print("c2: ",c2)
bCopy = b.copy() # создать копию списка
print("List b: ",b)
print("List bCopy: ",bCopy)
b.reverse() # поменять элем. местами с конца в начало
print("List b (reversed): ",b)
b.sort(reverse=True) # сортировка элементов списка
print("List b (sorted): ",b)
b.clear() # очистка списка
print("List b (cleared): ",b)
print("\n")
# сравнение списков
a1 = [1,2,4]
a2 = [1,2,3]
print("a1 == a2: ", a1 == a2)
a1.append(-1)
print("a1 == a2: ", a1 == a2)
print("a1 > a2: ", a1 > a2)
print("a1 < a2: ", a1 < a2)
print("\n\n")

# 9 point
list1 = [int(x) for x in input().split()]
list1.sort(reverse=True)
print(list1)

# 10 point
list2 = list1.copy()
list2.sort(reverse=False)

