import sys

# input = sys.stdin.readline
sys.stdin = open("input.txt", "r")

N = input()
S = input().strip()
print(S[-5:])