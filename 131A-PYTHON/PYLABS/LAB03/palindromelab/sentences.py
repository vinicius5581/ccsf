""" In this module allow sentences to be palindromes.  
    We ignore spaces, punctuation marks, etc. Also, not case-sensitive.

    We define three functions:  stripper, normalize, and is_palindrome.

>>> stripper("Madam, I'm Adam!")≈
'MadamImAdam'

>>> normalize("Madam, I'm Adam!")
'MADAMIMADAM'
>>> normalize("Catch22")
'CATCH'

>>> is_palindrome('Bob')
True
>>> is_palindrome("race car")
True
>>> is_palindrome("A man, a plan, a canal, Panama!")
True

"""

def stripper(s):
    """Removes spaces and non-letters.

    """

    # REPLACE THE pass BELOW WITH YOUR OWN LINES OF CODE
    # TO TEST IT DO ./testrunner at the unix command line
  
    whitelist = set('abcdefghijklmnopqrstuvwxyABCDEFGHIJKLMNOPQRSTUVWXYZ')
    return ''.join(ch for ch in s if ch in whitelist)
    

def normalize(s):
    """Returns the string s as a string consisting only of upper-case letters.

    """

    # REPLACE THE pass BELOW WITH YOUR OWN LINES OF CODE
    # TO TEST IT DO ./testrunner at the unix command line
    return stripper(s).upper()



def is_palindrome(sentence):
    """Returns True only if the sentence spells the same backwards,
    when we ignore spaces, upper or lower case, and punctuation marks.
    """
    
    import stringy
    
    # REPLACE THE pass BELOW WITH YOUR OWN LINES OF CODE
    # TO TEST IT DO ./testrunner at the unix command line
    
    s = sentence
    s = normalize(s)
    return stringy.is_palindrome(s)
 
  
