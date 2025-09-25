# 1. //는 몫 연산자 (정수 나눗셈)
# 2. 구간 합 구하는 공식 (시그마)
#    n * (n + 1) // 2

import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

A, B = map(int, input().strip().split(' '))

lo, hi = min(A, B), max(A, B)

def sigma(n):
    return n * (n + 1) // 2

print(sigma(hi) - sigma(lo - 1))