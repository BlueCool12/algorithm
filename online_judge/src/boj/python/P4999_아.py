import sys

# input = sys.stdin.readline
sys.stdin = open("input.txt", "r")

line1 = input()
line2 = input()

print("go" if len(line1) >= len(line2) else "no")