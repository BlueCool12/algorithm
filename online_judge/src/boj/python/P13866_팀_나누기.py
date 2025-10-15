
import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

skils = list(map(int, input().rstrip().split()))
skils.sort()

answer = (skils[0] + skils[3]) - (skils[1] + skils[2])

print(answer.__abs__())