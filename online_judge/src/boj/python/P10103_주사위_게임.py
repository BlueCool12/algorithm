
import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

n = int(input().rstrip())

changyoung = 100
sangduk = 100

for i in range(n):
    changyoungDice, sangdukDice = map(int, input().rstrip().split())
    if changyoungDice > sangdukDice:
        sangduk -= changyoungDice
    elif sangdukDice > changyoungDice:
        changyoung -= sangdukDice
    else:
        continue

print(changyoung)
print(sangduk)