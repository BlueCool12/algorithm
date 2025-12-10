
import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

sleep = int(input())
alarm = int(input())

if sleep <= alarm:
    print(alarm - sleep)
else:
    print((24 - sleep) + alarm)