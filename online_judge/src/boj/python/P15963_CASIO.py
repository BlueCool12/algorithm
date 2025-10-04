import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

N, M = input().rstrip().split(' ')
print(1 if N == M else 0)