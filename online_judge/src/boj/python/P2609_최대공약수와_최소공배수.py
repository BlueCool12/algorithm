# 1. 최대공약수(GCD) - 유클리드 호제법
# a, b: 두 자연수 그리고 a > b일 때
# GCD(a,b) = GCD(b,a mod b)
# 2. 최소공배수(LCM)
# LCM(a, b) = a * b / GCD(a, b)
# 3. 파이썬은 변수의 동시(다중) 할당이 가능함

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

numbers = list(map(int, input().split(' ')))
numbers.sort(reverse=True)

a, b = numbers[0], numbers[1]

# def gcd(a, b):    
#     if b == 0:
#         return a
#     return gcd(b, a % b)

def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

g = gcd(a, b)

print(g)
print(a * b // g)