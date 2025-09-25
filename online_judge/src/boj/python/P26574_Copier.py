# 1. 문자열 포맷팅으로도 가능
#    f"문자열~" 자바스크립트의 백틱과 비슷

import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n = int(input())

for i in range(n):
    number = input().strip()
    # print(number + " " + number)
    print(f"{number} {number}")