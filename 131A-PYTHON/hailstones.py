# Game ... starting with some positive seed number, maybe 7.
# You change the number this way: 
#  if n is even, divide by 2
#  if n is odd, do 3*n + 1
#  repeat
# stop if you get to 1.



seed = 420

n = seed

while n > 1:
    print(n)
    if n % 2 == 0:
        n = n//2
    else:
        n = 3 * n + 1
print(n)

