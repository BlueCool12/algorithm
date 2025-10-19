# 1. 파이썬에서는 문자열 slicing이 가능
# 2. s[:i] -> 제거할 구간 앞부분
# 3. s[j:] -> 제거할 구간 뒷부분

import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n = int(input())

# for i in range(n):
#     data, start, end = input().rstrip().split()

#     answer = ''
#     for j in range(data.__len__()):        
#         if (j < int(start) or j >= int(end)):
#             answer += data[j]        

#     print(answer)

for _ in range(n):
    s, i, j = input().split()
    i, j = int(i), int(j)
    print(s[:i] + s[j:])