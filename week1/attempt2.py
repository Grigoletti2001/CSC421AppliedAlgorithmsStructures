from itertools import permutations

from collections import Counter

from itertools import chain

list1=['*','/','+','-','*','/','+','-','*','/','+','-']

comb = permutations(list1, 3) #It will find all the combinations

x=[] #i.e. 64 combinations as we have to choose 3 operators out of 4 i.e.4*4*4=64

for i in comb:

	if i not in x:

		x.append(i)

c=0

dict={}

for i in x: ## fevery possible combination we will store its value in dictionary... the power of a python dictionary

	y = [t for t in i]

i=[t for t in y]

ans=[4,4,4,4]

if '*' in i: ## multiplication in the array
	ind=i.index('*')

num=ans[ind+1]*ans[ind] # multiple the no before that index and after that

ans[ind+1]=num

ans[ind]=num

del i[ind] ##delte '*' from position ind

del ans[ind+1] ## as the list of operators will decrement.

if '*' in i:

	ind=i.index('*')

num=ans[ind+1]*ans[ind]

ans[ind+1]=num

ans[ind]=num

del i[ind]

del ans[ind+1]

if '*' in i:

	ind=i.index('*')

num=ans[ind+1]*ans[ind]

ans[ind+1]=num

ans[ind]=num

del i[ind]

del ans[ind+1]

if '/' in i:

	ind=i.index('/')

num=ans[ind]/ans[ind+1]

ans[ind+1]=num

ans[ind]=num

del i[ind]

del ans[ind+1]

if '/' in i:

	ind=i.index('/')

num=int(ans[ind]/ans[ind+1])

ans[ind+1]=num

ans[ind]=num

del i[ind]

del ans[ind+1]

if '/' in i:

	ind=i.index('/')

num=int(ans[ind]/ans[ind+1])

ans[ind+1]=num

ans[ind]=num

del i[ind]

del ans[ind+1]

if '+' in i:

ind=i.index('+')

num=int(ans[ind+1]+ans[ind])

ans[ind+1]=num

ans[ind]=num

del i[ind]

del ans[ind+1]

	if '+' in i:

ind=i.index('+')

num=ans[ind+1]+ans[ind]

ans[ind+1]=num

ans[ind]=num

del i[ind]

del ans[ind+1]

	if '+' in i:

ind=i.index('+')

num=ans[ind+1]+ans[ind]

ans[ind+1]=num

ans[ind]=num

del i[ind]

del ans[ind+1]

	if '-' in i:

ind=i.index('-')

num=ans[ind]-ans[ind+1]

ans[ind+1]=num

ans[ind]=num

del i[ind]

del ans[ind+1]

	if '-' in i:

ind=i.index('-')

num=ans[ind]-ans[ind+1]

ans[ind+1]=num

ans[ind]=num

del i[ind]

del ans[ind+1]

	if '-' in i:

ind=i.index('-')

num=ans[ind]-ans[ind+1]

ans[ind+1]=num

ans[ind]=num

del i[ind]

del ans[ind+1]

num=int(num)

dict[str(num)]="4"+y[0]+"4"+y[1]+"4"+y[2]+"4="+str(num)

cases = input("Enter no of test cases: ") ## No of test cases

	for i in range(int(cases)):

val=input("Enter integer: ") #test it out

	if val in dict: 

print(dict[val]) #display results

else:

print("No solution")