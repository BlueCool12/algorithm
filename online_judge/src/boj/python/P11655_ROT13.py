# 1. ROT13
# 2. 리스트 컴프리핸션 + 조건식으로도 풀이 가능
# 3. Python 3.9 이상에서는 codecs 모듈의 encode로도 가능

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

S = input().rstrip()

# chars = list(S)
# for i in range(len(chars)):
#     code = ord(chars[i])
#     if code > 64:
#         if code >= 65 and code <= 90:
#             code += 13
#             if code > 90:
#                 code -= 26
#         if code >= 97 and code <= 122:
#             code += 13
#             if code > 122:
#                 code -= 26

#     chars[i] = chr(code)
        
chars = [
    chr((ord(c) - ord('A') + 13) % 26 + ord('A')) if 'A' <= c <= 'Z'
    else chr((ord(c) - ord('a') + 13) % 26 + ord('a')) if 'a' <= c <= 'z'
    else c
    for c in S
]

print(''.join(chars))