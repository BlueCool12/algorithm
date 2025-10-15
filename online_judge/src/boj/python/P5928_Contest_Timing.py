# 1. 모든 시간을 분 단위로 환산한 뒤 차이만 구하는게 더 깔끔

import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

# timing = list(map(int, input().rstrip().split()))

# answer = (timing[2] - 11) + ((timing[1] * 60) - (11 * 60)) + (timing[0] * 24 * 60) - (24 * 60 * 11)
# print(answer if answer >= 0 else -1)

D, H, M = map(int, input().rstrip().split())

start = 11 * 24 * 60 + 11 * 60 + 11
end = D * 24 * 60 + H * 60 + M

diff = end - start
print(diff if diff >= 0 else -1)