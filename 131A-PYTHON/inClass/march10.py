# price = dict(apple=2.50, oranges=0.99, watermelon=4.00)
# print price
#
# lbs = dict(apples=3, oranges=1, watermelon=2.5)
# print lbs
#
# #SUM numbers of a list of numbers
# def listsum(numList):
#    if len(numList) == 1:
#         return numList[0]
#    else:
#         return numList[0] + listsum(numList[1:])
#
# #calculate total
# def totalbill(price,lbs):
#     return [sum(a*b for a,b in zip(price,lbs))]
#
# #print(listsum(totalbill(price,list)))
# print totalbill(price,list)


dict1 = {'a': 1, 'b': 2, 'c': 3}
dict2 = {'a': 15, 'b': 10, 'd': 17}
dict3 = dict()

for key, value in dict1.iteritems():
    if key in dict2:
         dict3[key] = int(dict1[key]) * int(dict2[key])


print dict3