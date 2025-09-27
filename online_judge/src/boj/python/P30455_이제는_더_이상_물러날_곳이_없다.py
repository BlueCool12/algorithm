# 간단한 게임 이론과 홀짝 규칙으로 푸는 문제

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

N = int(input())

print("Duck" if N % 2 == 0 else "Goose")