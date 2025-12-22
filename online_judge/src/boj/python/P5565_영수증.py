
import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

total = int(input())

for i in range(9):
    total -= int(input())

print(total)