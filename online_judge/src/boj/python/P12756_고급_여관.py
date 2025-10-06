import sys
import math

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

A = list(map(int,input().split()))
B = list(map(int,input().split()))

if math.ceil(B[1] / A[0]) < math.ceil(A[1] / B[0]):
    print('PLAYER A')
elif math.ceil(B[1] / A[0]) > math.ceil(A[1] / B[0]):
    print('PLAYER B')
else:
    print('DRAW')