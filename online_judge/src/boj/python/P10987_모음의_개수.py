import sys

# input = sys.stdin.readline
sys.stdin = open("input.txt", "r")

word = input()
count = 0

for ch in word:
    if ch == "a" or ch == "e" or ch == "i" or ch == "o" or ch == "u":
        count += 1

print(count)
