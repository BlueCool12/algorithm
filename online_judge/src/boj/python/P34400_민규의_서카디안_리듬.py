import sys

# input = sys.stdin.readline
sys.stdin = open("input.txt", "r")

T = int(input())
for t in range(T):
    time = int(input()) % 25
    print("OFFLINE") if time >= 17 else print("ONLINE")
