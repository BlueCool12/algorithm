import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

for line in sys.stdin:
    a, b = map(int, line.split())
    print(a + b)