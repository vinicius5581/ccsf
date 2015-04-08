""" File:  mywordreader.py
Code by Nehemiah Loury guided by the class and uwostner.
CS131A Python Programming. 
"""

FILE = "mytonguetwisters/howmuchwood.txt"
MYWORDS = []

with open(FILE, 'r') as fd:
    for line in fd:
        line = line.strip()
        if not line:
            continue
        print(line)
        words = line.split()
        MYWORDS += words      # Concatenates words to MYWORDS
        print(words)

print(20*"-", 'GROUP', 20*'-')
print(MYWORDS)        

print(20*"-", 'GROUP sorted', 20*'-')
MYWORDS = sorted(MYWORDS)
print(MYWORDS)
