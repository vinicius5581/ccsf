"""The program in this file reads a file
and prints back all the lines from that file,
but skips blank lines.
"""

FILENAME = 'tonguetwister.txt'

# Open our file for reading, using a so-called 
# with-statement, also called a context.
# Using 'r' means for reading.
# Using 'w' means for writing
# Using 'a' means for appending.

with open(FILENAME, 'r') as f:
    for line in f:
        line = line.strip()     # remove whitespace
        if line == '':  continue        # continue if the line is blank
        print(line)

