# 1. 파이썬에서 Map 자료구조 = dict
# 2. zip()은 여러 개의 리스트를 같은 인덱스끼리 묶어서 튜플로 만들어주는 함수

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

seminars = ['Algorithm', 'DataAnalysis', 'ArtificialIntelligence', 'CyberSecurity', 'Network', 'Startup', 'TestStrategy']
classroom = ['204', '207', '302', 'B101', '303', '501', '105']

seminar = dict(zip(seminars, classroom))

N = int(input())

for i in range(N):
    print(seminar[input().strip()])