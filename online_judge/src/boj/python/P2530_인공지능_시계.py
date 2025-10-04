import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

A, B, C = map(int, input().rstrip().split(' '))

# startTime = C + (B * 60) + (A * 60 * 60)
# endTime = startTime + int(input())

# hour = endTime // 3600
# min = (endTime - (hour * 3600)) // 60
# sec = endTime - (hour * 3600) - (min * 60)

# print(f"{hour % 24} {min} {sec}")

add = int(input())

total = A * 3600 + B * 60 + C + add
hour = (total // 3600) % 24
minute = (total % 3600) // 60
second = total % 60

print(hour, minute, second)