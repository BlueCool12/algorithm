# 1. ** 은 파이썬의 거듭제곱 연산자

import sys
import math

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

while True:
    B, N = map(int, input().split())
    if B == 0 and N == 0:
        break

    # B의 N제곱근
    a = B ** (1 / N)

    # 가장 가까운 정수로 반올림
    low = math.floor(a)
    high = math.ceil(a)

    if abs(B - low ** N) <= abs(B - high ** N):
        print(low)
    else:
        print(high)