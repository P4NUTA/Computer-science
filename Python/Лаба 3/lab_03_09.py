'''
 Работа с файлами
'''
file1 = open("file1.txt", "r")  # открыть на чтение
st = file1.read(1)  # считать 1 символ
st += file1.read()  # считать до конца файла
print("File1: ", st)
file1.close()
# считать построчно
file2 = open("file2.txt", "r")
print("File2: ")
i = 0
for line in file2:  # итерация по строкам файла
    print("Line {}: {}".format(i, line.replace("\n", "")))
    i += 1
file2.close()
# запись в файл
file3 = open("file3.txt", "w")
for s in "Strings can be easily written to file":
    file3.write(s)
    if s == " ":
        file3.write("\n")
print("File 3 was written successfully")
file3.close()
