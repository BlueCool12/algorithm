
import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

N = int(input().rstrip())

sum = 0
for i in range(N):
    width = int(input().split()[0])    
    if width == 154:
        sum += 50000
    elif width == 148:
        sum += 10000
    elif width == 142:
        sum += 5000
    elif width == 136:
        sum += 1000

print(sum)