print(10*"-", 'MYWORDS, a long list', 10*"-")

MYWORDS = ['how', 'much', 'wood', 'would', 'a', 'woodchuck', 'chuck', 
'if', 'a', 'woodchuck', 'would', 'chuck', 'wood', 'a', 'woodchuck', 
'would', 'chuck', 'as', 'much', 'wood', 'as', 'a', 'woodchuck', 'would', 
'chuck', 'if', 'a', 'woodchuck', 'would', 'chuck', 'wood']

print(MYWORDS)

freq = dict()

for word in MYWORDS:
    if word not in freq:
        # if word not in freq, give frequency 1
        freq[word] = 1
    else:
        freq[word] = freq[word] + 1
        # freq[word] += 1

print(20*"-", 'the freqing dictionary', 20*'-')
print(freq)


template = "{:<10s}{:3d}"

print(10*"-", 'words and frequencies', 10*'-')

for word in freq:
    print(template.format(word, freq[word]))

print(10*"-", 'words and frequencies, alphabetically', 10*'-')

nicekeys = sorted(freq)

for word in nicekeys:
    print(template.format(word,freq[word]))
