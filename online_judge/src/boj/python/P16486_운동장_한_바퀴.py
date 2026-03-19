import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

d1 = int(input())
d2 = int(input())

pi = 3.141592
print((2 * d1) + (2 * pi * d2))