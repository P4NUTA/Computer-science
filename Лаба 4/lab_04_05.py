class Person:
    def __init__(self, firstname, lastname, age):
        self.firstname = firstname
        self.lastname = lastname
        self.age = age

    def display(self):
        print("First name : ", self.firstname)
        print("Last name : ", self.lastname)
        print("Age : ", self.age)


class Student(Person):
    count = 0

    def __init__(self, firstname, lastname, age, recordBook=[]):
        self.firstname = firstname
        self.lastname = lastname
        self.age = age
        self.id = Student.count
        self.recordBook = recordBook
        Student.count += 1

    def display(self):
        print("First name : ", self.firstname)
        print("Last name : ", self.lastname)
        print("Age : ", self.age)
        print("StudentID : ", self.id)
        print("recordBook : ", self.recordBook)


p1 = Student("Pavel", "Efimov", 18, [5, 2, 3, 4, 5])
p1.display()
p2 = Student("Aleksei", "Malyshev", 18, [5, 4, 5, 3, 4])
p2.display()
p3 = Student("Ksenia", "Anisimova", 18, [5, 5, 5, 4, 5])
p3.display()
