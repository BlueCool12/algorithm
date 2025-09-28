# 리스트 컴프리핸션 + max()로도 가능

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

A, B = input().rstrip().split(' ')

# reverseA = A[::-1]
# reverseB = B[::-1]

# print(reverseA if int(reverseA) > int(reverseB) else reverseB)

print(max(A[::-1], B[::-1], key=int))