
import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n = int(input())

for i in range(n):
    totalPrice = 0
    carPrice = int(input())
    options = int(input())

    totalPrice += carPrice

    for i in range(options):
        option = list(map(int, input().split(" ")))
        totalPrice += option[0] * option[1]

    print(totalPrice)
