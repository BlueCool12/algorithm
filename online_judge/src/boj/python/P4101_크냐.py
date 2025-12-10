# 1. 리스트로 묶지 않고 바로 언패킹도 가능

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

# while(True):
#     result = list(map(int, input().rstrip().split()))

#     if (result[0] != 0 and result[1] != 0):
#         print('Yes' if result[0] > result[1] else 'No')
#     else:
#         break

while True:
    a, b = map(int, input().split())

    if a == 0 and b == 0:
        break

    print('Yes' if a > b else 'No')