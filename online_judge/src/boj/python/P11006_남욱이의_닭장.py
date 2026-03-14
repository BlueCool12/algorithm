import sys

# input = sys.stdin.readline
sys.stdin = open("input.txt", "r")

T = int(input())

for i in range(T):
    line = list(map(int, input().split()))
    count = line[1] * 2 - line[0]
    print(f"{count} {line[1] - count}")