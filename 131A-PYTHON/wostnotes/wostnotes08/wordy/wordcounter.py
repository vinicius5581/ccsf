# Copyright (c) 2015 Ulf Wostner <wostner@cyberprof.com>
# All rights reserved.  Do not post or distribute in any form.

"""Module: wordcounter. Defines a function named wordfreqs.
    Might add more functions here later.
"""

def wordfreqs(words):
    """Returns a dict showing word frequencies for the given words.

    """

    d = dict()

    for word in words:
        if word not in d:
            d[word] = 1
        else:
            d[word] += 1

    return d


