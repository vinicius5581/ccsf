from random import shuffle

class Hand(list):
  pass

class Deck(object):

  rank = '23456789TJQKA'
  suit = 'CSHD'

  def deal(self, n):
    deck = [r+s for r in Deck.rank for s in Deck.suit]
    shuffle(deck)
    return [Hand(sorted(deck[i::n], key=Deck.cmpkey)) for i in xrange(n)]

  @staticmethod
  def cmpkey(card):
    return Deck.rank.index(card[0]), Deck.suit.index(card[1])

print Deck().deal(8)