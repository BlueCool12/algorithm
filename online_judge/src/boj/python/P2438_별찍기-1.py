import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n = int(input())

for i in range(n):    
    print('*' * (i + 1))