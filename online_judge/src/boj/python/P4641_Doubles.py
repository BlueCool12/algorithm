# 1. 각 x에 대해 2*x가 같은 리스트 안에 있으면 카운트

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

while True:
    line = input().strip()

    if line == "-1":
        break

    arr = list(map(int, line.split()))

    nums = []
    for v in arr:
        if v == 0:
            break
        nums.append(v)

    count = 0
    for x in nums:
        if x * 2 in nums:
            count += 1

    print(count)