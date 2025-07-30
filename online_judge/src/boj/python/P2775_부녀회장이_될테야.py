# 1. 2차원 배열 - 리스트 컴프리헨션 방식
# k + 1번 반복해서 행을 만듬 (0층부터 k층)
# 각 행은 길이가 n + 1인 리스트 (1호부터 n호까지)
# 2. 초기 조건인 0층 및 각 층의 1호 초기화
# 3. 점화식 apt[k][n] = apt[k][n - 1] + apt[k - 1][n]

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

t = int(input())

for i in range(t):
    k = int(input())
    n = int(input())
    
    apt = [[0] * (n + 1) for _ in range(k + 1)]

    for i in range(1, n + 1):
        apt[0][i] = i

    for i in range(k + 1):
        apt[i][1] = 1

    for i in range(1, k + 1):
        for j in range(2, n + 1):
            apt[i][j] = apt[i][j - 1] + apt[i - 1][j]

    print(apt[k][n])