import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

print((int(input()) * 3) + (int(input()) * 4) + (int(input()) * 5))