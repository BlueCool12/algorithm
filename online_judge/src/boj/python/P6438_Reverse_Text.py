import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

N = int(input())

for i in range(N):
  print(input().rstrip()[::-1])