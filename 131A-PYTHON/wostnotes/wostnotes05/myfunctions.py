"""Here we practice defining and using our own functions.
   Sample use:

    >>> ulam(10)
    5
    >>> ulam(7)
    22
"""

def ulam(n):
    """For a given n, this function returns the value used hailstone numbers.
    """

    if (n % 2 == 1):            # n odd
        return 3*n + 1    
    else:                       # n even
        return n // 2           


