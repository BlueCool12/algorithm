
import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

w = int(input())
l = int(input())

print(w * l)