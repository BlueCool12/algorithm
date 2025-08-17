import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n = int(sys.stdin.readline())
nums = [int(sys.stdin.readline()) for _ in range(n)]

nums.sort()

for i in nums:
    print(i)