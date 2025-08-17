# 1. 브루트포스 문제
# 2. '666' in str(series)는 문자열 안에 서브스트링 
# '666'이 포함되어 있는지를 검사해서 True/False를 반환

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n = int(input())

count = 0
series = 666

# while(count < n):
#     if str(series).find('666') >= 0:
#         count += 1        

#     if (count == n):
#         print(series)

#     series += 1

while True:
    if '666' in str(series):
        count += 1
        if count == n:
            print(series)
            break

    series += 1