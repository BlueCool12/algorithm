import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

A = int(input().rstrip())
B = int(input().rstrip())

print(A + B)
print(A - B)
print(A * B)