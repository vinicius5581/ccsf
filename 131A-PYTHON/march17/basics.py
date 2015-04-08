__author__ = 'vinicius'


class Bag:
    """We define a class called Bag.
    """

    def __init__(self):
        """Create a Bag
        """
        self.data = []

    def add(self, x):
        """Add x to the bag."""
        self.data.append(x)

    def content(self):
        """What's in the bag."""
        return self.data


    def len(self):
        return len(self.data)

    def __len__(self):
        return len(self.data)

    def __str__(self):
        """Returns a nice string that will then be used by print."""
        return "<Bag: with {} items {}>".format(len(self.data), self.data)

    def __repr__(self):
        return "<Bag has {} items>".format(len(self.data))



# Testing our Bag Class.

#Create an INSTANCE (an object) of the Bag CLASS.
mybag = Bag()

yourbag = Bag()

#Apply the add METHOD to out Bag OBJECT
mybag.add('apple')
mybag.add('banana')
yourbag.add('orange')

print(mybag)

#The data ATTRIBUTE of our Bag OBJECT gives the list below.
print(yourbag)

print(mybag.data)
print(yourbag.data)
print(mybag.content())
print(yourbag.content())

print(type(yourbag))
#using len(self)
print(mybag.len())
print(yourbag.len())

#using __len__(self)

print(len(mybag))

print("Hello World")

print(len(yourbag))

print("Hello World")

mybag
