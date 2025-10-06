# 1. split()에 인자를 주지 않으면 모든 공백 문자(whitespace)를 기준으로 나눔

import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

N = int(input().rstrip())
# A, B, C = map(int, input().rstrip().split(' '))

# A = min(A, N)
# B = min(B, N)
# C = min(C, N)

# print(A + B + C)

arr = list(map(int, input().split()))
arr = [min(x, N) for x in arr]
print(sum(arr))