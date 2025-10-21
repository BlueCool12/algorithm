import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

s1, s2 = map(int, input().rstrip().split())

print("E" if s1 >= s2 / 2 else "H")