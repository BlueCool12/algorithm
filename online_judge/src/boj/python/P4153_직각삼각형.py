# 1. list()는 새로운 리스트를 생성
# 2. sort()는 원본 리스트를 정렬하고 반환값은 None sorted()는 정렬된 새로운 리스트를 반환
# 3. **은 거듭제곱 연산자로 뒤에 오는 숫자만큼 곱함 pow()와 동일

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

while True:
    sides = list(map(int, input().split(' ')))

    if sides == [0, 0, 0]:
        break

    sides.sort()

    if (sides[0] ** 2) + (sides[1] ** 2) == sides[2] ** 2:
        print('right')
    else:
        print('wrong')