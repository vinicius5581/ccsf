"""Read a file and return a list of lists. 

>>> mylists = file2lists('data/forbeswomen.tsv')
>>> mylists[0]
['rank', 'country', 'name', 'title']
>>> mylists[17]
['17', 'United States', 'Beyoncé Knowles', 'Singer-songwriter']
"""

# Some common separators.
TAB = '\t'
COMMA = ','
SPACE = ' '
DOUBLE_SPACE = 2*SPACE
COLON = ':'
PERIOD = '.'

def fileseparator(filename):
    """Returns the file separator based on the filename.
    Default is SPACE.

    >>> fileseparator('mystuff.tsv') == TAB
    True
    >>> fileseparator('mystuff.csv') == COMMA
    True

    >>> fileseparator('mystuff.txt') == SPACE
    True
    """

    # REMOVE THIS LINE AND THE pass BELOW WITH YOUR OWN CODE.
    pass
    

def file2lists(filename, separator=None):
    """Reads the lines from the file named filename, and breaks each line down using the separator.
    Returns a list of lists.  See the tests for more details.

    Based on the filename extesion TAB or COMMA will be used as separator.
    If not recognized, the default separator is SPACE.

    """

    # REMOVE THIS LINE AND THE pass BELOW WITH YOUR OWN	CODE.
    pass

if __name__ == '__main__':
    import doctest
    doctest.testmod()


