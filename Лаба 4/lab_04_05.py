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


class Professor(Person):
    count = 0

    def __init__(self, firstname, lastname, age, degree):
        self.firstname = firstname
        self.lastname = lastname
        self.age = age
        self.id = Professor.count
        self.degree = degree
        Professor.count += 1

    def display(self):
        print("First name : ", self.firstname)
        print("Last name : ", self.lastname)
        print("Age : ", self.age)
        print("ProfessorID : ", self.id)
        print("Degree : ", self.degree)


s1 = Student("Pavel", "Efimov", 18, [5, 2, 3, 4, 5])
s1.display()
s2 = Student("Aleksei", "Malyshev", 18, [2, 4, 5, 2, 4])
s2.display()
s3 = Student("Ksenia", "Anisimova", 18, [5, 5, 5, 4, 5])
s3.display()

P1 = Professor("Galina", "Li", 18, "PhD")
P1.display()
P2 = Professor("Vladimir", "Gololobov", 18, "PhD")
P2.display()
P3 = Professor("Ekaterina", "Antropova", 18, "PhD")
P3.display()
