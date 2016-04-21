"""Convert a given list to either a TD row or a TH row,  usable in an HTML table.


"""

def list2TDrow(mylist):
    """Returns a data row suitable for a webpage html table.

    >>> mylist = ['San Francisco', 'Paris', 'London', 'Shanghai', 'Hong Kong']

    >>> list2TDrow(mylist)    
    '<tr><td>San Francisco</td><td>Paris</td><td>London</td><td>Shanghai</td><td>Hong Kong</td></tr>'

    >>> list2TDrow(list('ABCDEFGHIJ'))
    '<tr><td>A</td><td>B</td><td>C</td><td>D</td><td>E</td><td>F</td><td>G</td><td>H</td><td>I</td><td>J</td></tr>'

    """

    # REMOVE THIS LINE AND THE pass BELOW WITH YOUR OWN CODE.
    # rtn_list = ["<tr>"]
    # for element in mylist:
    #     rtn_list.append("<td>" + element + "</td>")
    # rtn_list.append("</tr>")
    # return "".join(rtn_list)


    return "".join(["<tr>"] + ["<td>" + element + "</td>" for element in mylist] + ["</tr>"])



def list2THrow(mylist):
    """Returns a header row suitable for a webpage html table.

    >>> headers = ['Last Name', 'First Name', 'Phone']
    >>> list2THrow(headers)
    '<tr><th>Last Name</th><th>First Name</th><th>Phone</th></tr>'
    """

    # REMOVE THIS LINE AND THE pass BELOW WITH YOUR OWN CODE.
    return "".join(["<tr>"] + ["<th>" + element + "</th>" for element in mylist] + ["</tr>"])



def caption(mycaption):
    """Returns a caption suitable for an HTML table.

    >>> caption('Table with My Favorite Cities')
    '<caption>Table with My Favorite Cities</caption>'
    """

    # REMOVE THIS LINE AND THE pass BELOW WITH YOUR OWN CODE.
    return "<caption>" + mycaption + "</caption>"

    
if __name__ == '__main__':
    import doctest
    doctest.testmod()

    


