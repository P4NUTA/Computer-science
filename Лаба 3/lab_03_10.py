# 24 point
file1 = open("text1.txt", "r")
st = file1.read().lower()
file1.close()

file2 = open("textDict.txt", "w")

for s in st:
    if s == " ":
        file2.write("\n")
    elif s == "," or s == "." or s == "-":
        file2.write("")
    else:
        file2.write(s)

file2.close()
file2 = open("textDict.txt", "r")

data = []
data_ind = []
for line in file2:
    data.append(line)
temp = 0
for line in data:
    temp = data.count(line)
    data_ind.append(temp)
file2.close()
file2 = open("TextDict.txt", "w")
i = 0
for line in data:
    file2.write(str(data_ind[i]))
    file2.write(" - ")
    file2.write(data[i])
    i += 1
