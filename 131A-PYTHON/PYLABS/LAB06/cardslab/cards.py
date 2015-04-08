""" Deck of cards.

    http://en.wikipedia.org/wiki/Standard_52-card_deck

    http://en.wikipedia.org/wiki/Standard_52-card_deck#mediaviewer/File:Piatnikcards.jpg

    Study the test files in the tests directory of this cardslab to learn what exactly
    our functions below are supposed to do.

"""

SUITS_LONG = ['Clubs', 'Diamonds', 'Hearts', 'Spades']
RANKS_LONG = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'Jack', 'Queen', 'King', 'Ace']

# We will use only the first character for suit.
SUITS = [suit[0] for suit in SUITS_LONG]

# To save electrons we will use shorter strings for the ranks.
RANKS = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K', 'A']


def deck():
    """A function that uses loops and the lists SUITS and RANKS
    to create a list of the 52 cards.

    """
    return  [r+s for s in SUITS for r in RANKS]

#print deck()

def suit(card):
    """Returns the suit of the card."""
    return card[-1]

def rank(card):
    """Returns the rank of the card."""

    return card[:-1]

def is_ace(card):
    """Returns True only if card is an Ace."""
    return card[0] == 'A'


def value(card, acehigh=True):
    """Returns the value of the card. Jack, Queen , King have values 11, 12, 13, 
    respectively. If acehigh then Ace has value 14, otherwise Ace has value 1.
    """
    if is_ace(card):
        if acehigh:
            return 14
        else:
            return 1
    else:
        return RANKS.index(rank(card))+2


#print 'Card Value: ', value('AC', False )
