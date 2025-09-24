# 1. python에서 삼항연산자는 a if 조건식 else b

import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

N, M = map(int, input().strip().split(' '))
print("Yes" if 100 * N >= M else "No")