import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

nums = input().split()

ab = nums[0] + nums[1]
cd = nums[2] + nums[3]

print(int(ab) + int(cd))