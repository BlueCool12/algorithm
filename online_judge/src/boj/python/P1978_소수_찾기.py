
import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n = int(input())
nums = list(map(int, input().split(' ')))

def getPrime(num):
    if num == 1: return 0

    i = 2
    while True:
        if i == num:
            return 1
        else:
            if num % i == 0:
                return 0

        i += 1

count = 0
for num in nums:
    count += getPrime(num)

print(count)