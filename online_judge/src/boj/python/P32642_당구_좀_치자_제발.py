
import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

N = int(input())
weather = list(map(int, input().split()))

angerIndex = 0
totalAnger = 0
for i in weather:
      if i == 1:
            angerIndex += 1
            totalAnger += angerIndex
      else:
            angerIndex -= 1
            totalAnger += angerIndex

print(totalAnger)