""""Basic formatting of phone numbers.

    Terminology: In a phone number like (415) 123-4567, 
        415 is the area code, 
        123 is called the exchange, and 
        4567 the number.

    >>> phone('239', '3000')
    '(415) 239-3000'    

"""


def phone_basic(exchange, number, areacode):
    """Returns the phone number properly formatted. 

    See the test files for detailed examples.
    """

    # REPLACE THIS LINE AND THE pass BELOW WITH YOUR OWN CODE.

    pass




# But the area code is usually 415 so we can make that the default.

def phone_better(exchange, number, areacode='415'):
        """Returns the phone number properly formatted, and has default area code.

        See the test files for detailed examples.
        """

    # REPLACE THIS LINE AND THE pass BELOW WITH YOUR OWN CODE.

    pass



def phone_best(exchange, number, areacode='415', useperiod=False):
    """Returns phone number and allows use of periods.


    See the test files for detailed examples.
    """

    # REPLACE THIS LINE AND THE pass BELOW WITH YOUR OWN CODE.

    pass



# In the line below, we make the phone function the same as phone_best
# So, now we can just use phone instead of phone_best
# How about that!

phone = phone_best


     


