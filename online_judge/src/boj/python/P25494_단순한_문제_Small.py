import sys

# input = sys.stdin.readline
sys.stdin = open("input.txt", "r")

# T = int(input())
# for t in range(T):
#     a, b, c = map(int, input().split())
#     count = 0
#     x = 1
#     y = 1
#     z = 1

#     while True:
#         if x % y == y % z == z % x:
#             count += 1
        
#         if x == a and b == y and z == c:
#             break

#         if x < a:
#             x += 1

#         if y < b:
#             y += 1

#         if z < c:
#             z += 1

#     print(count)

T = int(input())
for _ in range(T):
    a, b, c = map(int, input().split())
    count = 0

    for x in range(1, a + 1):
        for y in range(1, b + 1):
            for z in range(1, c + 1):
                if x % y == y % z == z % x:
                    count += 1

    print(count)