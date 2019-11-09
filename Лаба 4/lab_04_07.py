class Row:
    id = 0

    def __init__(self, collection, value):  # Ввод списка и функции
        self.id = Row.id  # ид строки
        self.collection = collection  # [x1,x2] список
        self.value = value  # f(x1,x2) значение функции
        Row.id += 1

    def display(self):
        print("Collection :", self.collection)
        print("Value :", self.value)
        print("ID :", self.id)


class Table:
    def __init__(self, rows, rowsNum):
        self.rows = rows
        rows.pop(0)
        rows.pop(0)
        self.rowsNum = rowsNum

    def addRow(self, row):
        self.rows.append(row.id)
        self.rows.extend(row.collection)
        self.rows.append(row.value)

    def display(self):
        print(self.rows)
        print("\tid\tx1\tx2\tf(x1,x2)")
        for i in range(0, self.rowsNum * 4, 4):
            print("\t{} \t{} \t{} |\t{}".format(self.rows[i], self.rows[i + 1], self.rows[i + 2], self.rows[i + 3]))

            # class LogicFunction:
            #     variablesNum
            #     table = Table
            #
            #     def __init__(variablesNum, table):
            #
            #     def getExpression():
            #
            #     def getTable():
            #
            #     def printTable():


'''
Тут начинается выполнение программы
'''
if __name__ == '__main__':
    print("Rows")
    r1 = Row([0, 0], 0)
    r2 = Row([0, 1], 1)
    r3 = Row([1, 0], 1)
    r4 = Row([1, 1], 0)

    r1.display()
    r2.display()
    r3.display()
    r4.display()

    print("Table")
    t = Table([4, 5], 4)
    t.addRow(r1)
    t.addRow(r2)
    t.addRow(r3)
    t.addRow(r4)
    t.display()
