import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

N = int(input())

# arr = []
# for i in range(N):
#   arr.append(int(input()))

# answer = ""
# for i in sorted(arr):
#   answer += (str(i) + '\n')

# print(answer.strip())

arr = sorted(int(input()) for _ in range(N))
print('\n'.join(map(str, arr)))