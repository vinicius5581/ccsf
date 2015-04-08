"""Formulas used for calculating hailstone numbers.

Usage: from formulas import ulam

>>> ulam(5)
>>> 16
>>> ulam(7)
22
    
"""

def ulam(n):
    """Returns the next hailstone number after n.
    """

    # Replace the pass below with your own code.
    while n > 1:
        print(n)
        if n % 2 == 0:
            n = n//2
        else:
            n = 3 * n + 1
    return n;



