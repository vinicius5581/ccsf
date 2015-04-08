""" There are several ways that cards can be sorted. 

    We will use the indices (the positions) of the cards rank in RANKS, and suit in SUITS.
    See the test files in the tests directory to see the expected behavior of the functions.
"""

from cards import rank, suit
from cardindices import rank_index, suit_index


def rank_first_tuple(card):
    """Returns a tuple (r, s) where r is the rank index and s is the suit index of the card.
    """

    return rank_index(rank(card)), suit_index(suit(card))


def suit_first_tuple(card):
    """Returns a tuple (s, r) where s is the suit index and r is the rank index of the card.
    """

    return suit_index(suit(card)), rank_index(rank(card))


# With the functions above you now have three ways of sorting your list of cards.

# Hint: We just learned about the built-in function sorted, and how it can also be used with a key 
# to control how the sorting goes.


def sorted_alphabetically(cards):
    """ This is the default case of the built-in sorted function.
        It sorts alphabetically. Actually uses the ord of the characters.
    """

    return sorted(cards)


def sorted_by_rank(cards):
    """The list of cards is sorted by rank. If two cards have the same rank, the suit is used as tie-breaker.
    """

    cards_list = list()
    sorted_cards = list()
    for card in cards:
        cards_list.append(( rank_index(rank(card)), suit_index(suit(card)),card))

    return [p for m,n,p in sorted(cards_list)]




def sorted_by_suit(cards):
    """The list of cards is sorted by suit. If two cards have the same suit the rank is used as tie-breaker.
    """

    cards_list = list()
    sorted_cards = list()
    for card in cards:
        cards_list.append(( suit_index(suit(card)),rank_index(rank(card)), card))

    return [p for m,n,p in sorted(cards_list)]