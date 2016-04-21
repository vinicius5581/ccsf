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

    file_ext_dic = {'tsv':TAB,'csv':COMMA, 'txt':SPACE}

    file_ext = filename.split(PERIOD)[-1]

    if file_ext in file_ext_dic:
        return file_ext_dic[file_ext]
    return SPACE
    

def file2lists(filename, separator=None):
    """Reads the lines from the file named filename, and breaks each line down using the separator.
    Returns a list of lists.  See the tests for more details.

    Based on the filename extesion TAB or COMMA will be used as separator.
    If not recognized, the default separator is SPACE.

    """

    rtn_list = []
    separator = separator if separator else fileseparator(filename)
    with open(filename) as file_obj:
        for line in file_obj:
            line = line.strip()
            sub_list = line.split(separator)
            rtn_list.append(sub_list)
    return rtn_list



if __name__ == '__main__':
    import doctest
    doctest.testmod()


