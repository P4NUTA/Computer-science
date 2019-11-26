class Worker:
    'doc class Worker'
    count = 0

    def __init__(self, name, surname):
        self.name = name
        self.surname = surname
        Worker.count += 1

    def display(self):
        print("Worker:")
        print("{} {}".format(self.name, self.surname))


class Animal:
    count = 0

    def __init__(self, name, age):
        self.name = name
        self.age = age
        # 9 point
        self.id = Animal.count
        Animal.count += 1

    def display(self):
        print("Animal {} {} {}".format(self.name, self.age, self.id))


w1 = Worker("Ivan", "Ivanov")
print("w1.count: ", w1.count)
w2 = Worker("Alexei", "Petrov")
print("w2.count: ", w2.count)
print("w1.count: ", w1.count)
print("Worker.count: {0} \n".format(Worker.count))
print("Worker.__name__: ", Worker.__name__)
print("Worker.__dict__: ", Worker.__dict__)
print("Worker.__doc__: ", Worker.__doc__)
print("Worker.__bases__: ", Worker.__bases__)

# 7 point
# 8 point
# id является общим атрибутом
a0 = Animal("Ponyta", "3")
a1 = Animal("Roselia", "5")
a2 = Animal("Pikachu", "1")
a0.display()
a1.display()
a2.display()
