# 1. sort() 함수를 역순으로 하고 싶을땐 reverse=True

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

T = int(input())

for i in range(T):
    numbers = list(map(int, input().rstrip().split(" ")))
    numbers.sort(reverse=True)
    print(numbers[2])