""" To decide which card ranks higher than another cards we look in the lists RANKS and SUITS.

    There is a handy method for lists that we can use.

    $ pydoc3 list.index

    The index method returns the index (position) of the first occurence in the list.

    >>> cities = ['SF', 'LA', 'Boston', 'NY', 'London', 'Paris']
    >>> cities.index('Boston')
    2

    Tip:    Print out the test files in the tests directory in this lab.
            Use those to decide exactly what your functions are supposed to do.

"""

from cards import SUITS
from cards import RANKS
from cards import rank, suit


def suit_index(suit):
    """Returns the index of the suit in the SUITS list."""

    # REMOVE THIS LINE AND THE pass BELOW, AND WRITE YOUR OWN CODE THERE.
    pass


def rank_index(rank):
    """Returns the index of the rank in the RANKS list."""

    # REMOVE THIS LINE AND THE pass BELOW, AND WRITE YOUR OWN CODE THERE.
    pass


def rank_first_tuple(card):
    """Returns a tuple (r, s) where r is the rank index and s is the suit index of the card.
    """

    # REMOVE THIS LINE AND THE pass BELOW, AND WRITE YOUR OWN CODE THERE.
    pass


def suit_first_tuple(card):
    """Returns a tuple (s, r) where s is the suit index and r is the rank index of the card.
    """

    # REMOVE THIS LINE AND THE pass BELOW, AND WRITE YOUR OWN CODE THERE.
    pass


