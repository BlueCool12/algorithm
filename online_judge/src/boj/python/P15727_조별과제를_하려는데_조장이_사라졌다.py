# 1. python에는 math 모듈이 존재

import sys
import math
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

L = int(input())

print(math.ceil(L / 5))