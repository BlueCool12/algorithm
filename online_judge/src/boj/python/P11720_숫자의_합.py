# 1. len()는 문자열, 리스트, 튜플, 딕셔너리, 집합의 길이를 구하는 함수
# 2. strip()은 trim()과 비슷 문자열의 공백이나 줄바꿈을 제거
# 3. for c in 문자열: 형태로 반복 가능

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

lines = sys.stdin.readlines()

n = lines[1].strip()

answer = 0
for i in n:
    answer += int(i)

print(answer)