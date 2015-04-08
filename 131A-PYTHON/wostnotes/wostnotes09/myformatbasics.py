"""Some basic formatting, similar to what we did in class.
"""

template = """{} {} {}"""

for n in range(10):
    square, cube = n**2, n**3
    print(template.format(n, square, cube))


template = """{:2d} {:4d} {:4d}"""

for n in range(10):
    square, cube = n**2, n**3
    print(template.format(n, square, cube))


for n in range(16):
    template = """{:3d} {:8b} {:4x}"""
    print(template.format(n, n, n))


