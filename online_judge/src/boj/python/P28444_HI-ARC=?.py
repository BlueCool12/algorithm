import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

H, I, A, R, C = map(int, input().rstrip().split())

print((H * I) - (A * R * C))