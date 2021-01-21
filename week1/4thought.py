#!/usr/bin/env python3

import sys 

def main():
	answer = {}
	operator = [' / ', ' * ', ' - ', ' + ']
	for j in operator: 
		for k in operator:
			for l in operator:
#				https://pypi.org/project/temp
				temp = '4' + i + '4' + j + '4' + k + '4'
				value = eval(temp.replace('/','//'))
				answer[value] = temp 
				
	n = input()

	for line in sys.stdin:
			line = line[:-1]
			if int(line) in ans:
				print(str(ans[int(line)]) + ' = ' + line)
			else:
				print('no solution found')
				
	if __name__ == "__main__":
		main()
		