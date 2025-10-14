
import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

t = int(input().rstrip())

for i in range(t):
    x, y = map(int, input().rstrip().split())
    print(x + y)