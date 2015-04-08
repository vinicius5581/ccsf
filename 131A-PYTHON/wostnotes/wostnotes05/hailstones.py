# This hailstones function has so-called 
# side-effects, it prints out numbers.
# No need to return anything, just to print things.

from myfunctions  import ulam

def hailstones(seed):
    """For the given seed we print out
    all the hailstone numbers,
    using our ulam function too.
    """
    n = seed
    while n > 1:
        print(n, end=":")
        n = ulam(n)
    print(n)
    
# Let's test it.

seed = 7
hailstones(seed)

