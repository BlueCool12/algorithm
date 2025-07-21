import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n = int(input())

for i in range(9):
    print(f"{n} * {i + 1} = {n * (i + 1)}")