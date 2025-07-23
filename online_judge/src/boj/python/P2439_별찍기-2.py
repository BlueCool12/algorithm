# 1. 파이썬에서 print() 안에 *는 문자열 반복 혹은 언팩(unpack)
# 2. 언팩(unpack): 리스트, 튜플 등의 시퀀스를 하나하나 풀어서 전달

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n = int(input())

# for i in range(n):
#     star = ''
#     for j in range(n):
#         if j >= n - 1 - i:
#             star += '*'
#         else:
#             star+=' '
#     print(star)

for i in range(n):
    print(' ' * (n - i - 1) + '*' * (i + 1))