__author__ = 'vinicius'


"""In this module, vector, we define a Vector class, so we can make Vector obects.

>>> v = Vector(3,4)

>>> w = Vector(5, 12)

>>> len(v)

>>> v + w

"""

class Vector:

    def __init__(self, x, y):
        """Create a vector originated at origin(0,0)"""
        self.x = x
        self.y = y

    def __len__(self):
        """Length of the vector."""
        from math import sqrt

        #nicer notation to make it easier to read.

        a, b = self.x, self.y

        return int(sqrt(a**2 + b**2))

    def lenght(self):
        """Length of the vector."""
        from math import sqrt

        #nicer notation to make it easier to read.

        a, b = self.x, self.y

        return sqrt(a**2 + b**2)

    def __str__(self):
        return "<Vector: ({}, {})>".format(self.x, self.y)

v = Vector(3,4)
print(v)
print(len(v))
print(v.lenght())
