
import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

t = int(input())

for i in range(t):
  x = int(input())
  print(2 * x - 1)