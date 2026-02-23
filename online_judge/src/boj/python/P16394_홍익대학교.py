import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

year = input().strip()
print(int(year) - 1946)