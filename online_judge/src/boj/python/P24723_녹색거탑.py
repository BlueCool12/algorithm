# 1. **은 파이썬의 거듭제곱(제곱 연산자)

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n = int(input())

print(2 ** n)