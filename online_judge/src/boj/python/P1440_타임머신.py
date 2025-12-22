
import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

TIME = input().strip()

nums = list(map(int, TIME.split(':')))

count = 0

for i in range(3):
    for j in range(3):
        if j == i:
            continue
        for k in range(3):
            if k == i or k == j:
                continue

            h = nums[i]
            m = nums[j]
            sec = nums[k]

            if 1 <= h <= 12 and 0 <= m <= 59 and 0 <= sec <= 59:
                count += 1

print(count)