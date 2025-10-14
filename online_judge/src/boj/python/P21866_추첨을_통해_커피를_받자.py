
import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

score = [100, 100, 200, 200, 300, 300, 400, 400, 500]
studentScore = list(map(int, input().rstrip().split()))

sum = 0

for i in range(9):

    if studentScore[i] > score[i]:
        print("hacker")
        exit()

    sum += studentScore[i]

print("none" if sum < 100 else "draw")