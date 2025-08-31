import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

line = input().split(' ')

print(int(line[0]) + int(line[1]))