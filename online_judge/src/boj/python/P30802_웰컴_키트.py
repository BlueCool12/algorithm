# 1. math.ceil(x)은 x보다 크거나 같은 가장 작은 정수를 반환(올림)
# 2. sum(iterable)은 반복 가능한 객체의 요소들을 전부 더함
# 3. //(몫 연산자)는 나눗셈 후 정수 몫을 반환

import sys
import math

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n = int(input())

sizes = list(map(int, input().split(' ')))

t, p = map(int, input().split(' '))

# total_shirt_bundle = 0

# for i in sizes:
#     if i % t == 0:
#         total_shirt_bundle += i // t
#     else:
#         total_shirt_bundle += (i // t) + 1

## total_shirt_bundle += (i + t - 1) // t # 올림 계산의 수학적 트릭

# print(total_shirt_bundle)
# print(n // p, n % p)

total_shirt_bundle = sum(math.ceil(size / t) for size in sizes)

pen_bundle = n // p
pen_single = n % p

print(total_shirt_bundle)
print(pen_bundle, pen_single)