
import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

A, B, C = map(int, input().rstrip().split())

print("correct!" if A + B == C else "wrong!")