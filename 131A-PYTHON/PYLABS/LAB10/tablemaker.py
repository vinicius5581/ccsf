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
    rtn_table = ["<table>"]
    if mycaption:
        rtn_table.append(caption(mycaption))
    if mylists:
        rtn_table.append(list2THrow(mylists[0]))
        mylists = mylists[1:]
        for element in mylists:
            rtn_table.append(list2TDrow(element))
    rtn_table.append("</table>")
    return "\n".join(rtn_table)

def file2table(filename, mycaption=None):
    """From a given data file return an HTML table.

    
   """


    # REMOVE THIS LINE AND THE pass BELOW WITH YOUR OWN CODE.
    pass



if __name__ == '__main__':
    import doctest
    doctest.testmod()

