import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

N = int(input())

print('Accepted' if N * N <= 100000000 else 'Time limit exceeded')