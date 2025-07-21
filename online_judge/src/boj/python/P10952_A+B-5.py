import sys
input = sys.stdin.readline
# sys.stdin = open('input.txt', 'r')

while True:
    a, b = map(int, input().split())
    if a == 0 and b == 0:
        break
    print(a + b)