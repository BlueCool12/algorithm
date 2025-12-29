
import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n, m, k = input().split()

print((int(k) * int(m)) + int(m))