# 1. 파이썬의 /= 는 부동소수점(float) 나눗셈
# 2. 내림 나눗셈(몫)은 //= 단 피연산자 중 하나라도 float면 float를 반환

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n = int(input())

def factorial(n):
    if (n == 0):
        return 1    
    return n * factorial(n - 1)

factorialNum = factorial(n)

count = 0
while(True):
    if (factorialNum % 10 == 0):
        count += 1
        # factorialNum /= 10
        factorialNum //= 10
    else:
        break

print(count)