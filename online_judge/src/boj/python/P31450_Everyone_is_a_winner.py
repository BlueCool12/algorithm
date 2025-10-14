
import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

M, K = map(int, input().rstrip().split())

print("Yes" if M % K == 0 else "No")