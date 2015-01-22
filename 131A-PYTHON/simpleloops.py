#Countdown


#First Way
n = 10
while n >= 0:
    print(n)
    n = n - 1
print("take off A!!")

#Second Way
for i in [0,1,2,3,4,5]:
    print(i)
print("take off B!!")

#Third Way
for i in range (0,5):
    print(i)
print("take off C!! Using range")

#Another sample.Using continue
for i in range(0,10):
    if i in [7,3]:
        continue
    print(i)
print("take off another. Print with continue statement")

#Using Break

enough = 7
for i in range(1000000000000000000000):
    print(i, i*'A')
    if i == enough:
        break

print("Take off D, leaving the loop using break")

#Advanced: Nested loops
for i in 'ABC':
    print("i is now", i)
    for j in [1,2,3,4]:
        print("j is now", j)
        print(i,j)
	
print("Take off, leaving the loop using break")

#classrooms = [
#               {'BuldingCode':['Alice','Alan']},
#               {'Python':['Thuy', 'Vicky']}
#             ]

#Alternative way
#c = dict()
#d['BuildingCode'] = ['Alice','Alan'] 
             
#for classroom in classrooms:
#    print(classroom)
#    for student in classroom:
#        print(student)

