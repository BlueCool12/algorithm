import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

a, b = map(int, input().strip().split(' '))

print(0 if a - (a * b / 100) >= 100 else 1)