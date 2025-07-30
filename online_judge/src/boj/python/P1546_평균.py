# 1. map() 함수는 반복 가능한 자료형의 각 요소에 함수를 적용해서 그 결과를 
# 새로운 map 객체로 반환하는 고차 함수
# 2. sort() 함수에 reverse=True를 넘기면 역순 정렬

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n = int(input())

score = list(map(int, input().split(" ")))
score.sort(reverse=True)

m = score[0]

sum = 0
for i in score:
    sum += i / m * 100

print(sum / n)