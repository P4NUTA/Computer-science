import math


class Geometric:
    def calculateArea(self):
        print("Calculating area")


class Circle(Geometric):
    def __init__(self, a):
        self.side = a

    def _radius(self):
        b = pow(self.side,2) * math.pi
        print("Area of Circle {}: {}".format(self.side, b))


class Square(Geometric):
    def __init__(self, a):
        self.side = a

    def _perimeter(self):
        print("Perimeter of Square {}: {}\n".format(self.side, self.side * 4))

    def calculateArea(self):
        print("Area of Square {}: {}\n".format(self.side, pow(self.side, 2)))


geom = Geometric()
geom.calculateArea()
sq = Square(5)
sq.calculateArea()
sq._perimeter()

print("Check subclass: ", issubclass(Square, Geometric))
print("Check instance sq->Square: ", isinstance(sq, Square))
print("Check instance sq->Geometric: ", isinstance(sq, Geometric))
print("Check instance sq->dict: ", isinstance(sq, dict))

print("Geometric.__bases__: ", Geometric.__bases__)
print("Square.__bases__: ", Square.__bases__)
print("")
cir = Circle(4)
cir._radius()