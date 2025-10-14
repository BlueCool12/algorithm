
import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

numbers = list(map(int, input().rstrip().split()))
numbers.sort()
print(numbers[1])
