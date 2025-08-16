# 1. set()으로 중복 제거
# 2. sorted()의 key는 각 원소에 대해 정렬 기준값을 계산하는 함수

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n = int(input().strip())
words = [input().strip() for _ in range(n)]

sortedWords = sorted(set(words), key=lambda s: (len(s), s))

for word in sortedWords:
    print(word)