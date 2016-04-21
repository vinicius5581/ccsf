"""We create an HTML table from a list of lists.

For more details see the tests files.

"""

from tableware import list2TDrow, list2THrow, caption
from filetools import file2lists

def lists2table(mylists, mycaption=None):
    """
    >>> mylists = [['city', 'country'], ['SF', 'USA'], ['Paris', 'France'], ['Stockholm', 'Sweden']]
    >>> mycaption = 'Great Cities'
    >>> mytable = lists2table(mylists, mycaption)
    >>> print(mytable)
    <table>
    <caption>Great Cities</caption>
    <tr><th>city</th><th>country</th></tr>
    <tr><td>SF</td><td>USA</td></tr>
    <tr><td>Paris</td><td>France</td></tr>
    <tr><td>Stockholm</td><td>Sweden</td></tr>
    </table>

    """

    # REMOVE THIS LINE AND THE pass BELOW WITH YOUR OWN CODE.
    pass


def file2table(filename, mycaption=None):
    """From a given data file return an HTML table.

    
   """


    # REMOVE THIS LINE AND THE pass BELOW WITH YOUR OWN CODE.
    pass



if __name__ == '__main__':
    import doctest
    doctest.testmod()

