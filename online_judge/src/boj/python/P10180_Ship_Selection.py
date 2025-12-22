
import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

T = int(input())

for i in range(T):
    count = 0
    N, D = list(map(int, input().split(" ")))

    for i in range(N):
        vi, fi, ci = list(map(int, input().split(" ")))

        if vi * (fi / ci) >= D:
            count += 1

    print(count)