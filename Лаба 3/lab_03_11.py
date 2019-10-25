from huffman import HuffmanCoding
def encodeHuffman(fileIn, fileOut):
    simbols = []
    simbols_ind = []
    simbols_s = []
    i = 0
    array = []
    file1 = open(fileIn, "r")
    temp1 = file1.read()
    file2 = open(fileOut, "w")
    for s in temp1:
        simbols.append(s)
    for s in simbols:
        temp = simbols.count(s)
        simbols_ind.append(temp)
    for s in temp1:
        if not simbols_s.count(s):
            simbols_s.append(s)
    array.append(simbols)
    array.append(simbols_ind)
    print(array) #двумерный массив буква - повторение
    for s in simbols_s:
        file2.write(str(simbols_ind[i]))
        file2.write(" - ")
        file2.write(simbols_s[i])
        file2.write("\n")
        i += 1


def decodeHuffman(fileIn, fileOut):
    file1 = open(fileIn, "r")
    file2 = open(fileOut, "w")


if __name__ == "__main__":
    encodeHuffman("text1.txt", "24point.txt")
    file1 = open("text1.txt", "r")
    temp = file1.read().lower()
    p = HuffmanCoding("text1.txt")
    f1 = p.compress()
