import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

print(int(input()) * int(input()))