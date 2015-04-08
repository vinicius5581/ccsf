# Copyright (c) 2015 Ulf Wostner <wostner@cyberprof.com>
# All rights reserved.  Do not post or distribute in any form.

""" Module: wordreader. We define a function file2words that reads from a file 
    and returns a list of the words in that file.

"""

def file2words(filename):
    """Reads a file and returns a list of the words in that file.
    """

    result = []

    with open(filename, 'r') as f:
        for line in f:
            words = line.split()
            result += words 

    return result



