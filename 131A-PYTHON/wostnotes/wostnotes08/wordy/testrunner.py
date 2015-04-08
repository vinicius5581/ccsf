# Copyright (c) 2015 Ulf Wostner <wostner@cyberprof.com>
# All rights reserved.  Do not post or distribute in any form.

import doctest

"""  Run this file from the command line.
    
    $ python3 testrunner.py

    For tests, no output means the tests came out ok.

    (c) 2015 Ulf Wostner <wostner@cyberprof.com>
    Do not post, distribute, or share these files.
"""


if __name__ == '__main__':
    doctest.testfile('test.txt', optionflags=556)


