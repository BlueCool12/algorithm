# 1. find()는 문자열에서 부분 문자열을 탐색해서 인덱스를 반환 (없으면 -1)
# 2. enumerate()는 반복 가능한 객체를 돌 때 인덱스와 값을 동시에 꺼내주는 함수
# 3. 파이썬의 삼항 연산자 (value_if_true) if condition else (value_if_false)
# 4. 브루트포스가 아닌 모듈러 역원으로도 풀이 가능

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

line = sys.stdin.readline().strip()

# index = 0
# sum = 0
# for i in range(13):
    
#     if line[i] == '*':
#         index = i
#         continue

#     if i % 2 == 0:
#         sum += int(line[i])
#     else:
#         sum += (int(line[i]) * 3)

# multiple = 1
# if index % 2 != 0:
#     multiple = 3

# index = 0
# while(True):
#     if ((index * multiple) + sum) % 10 == 0:
#         print(index)
#         break
    
#     index += 1

star_pos = line.find('*')

total = 0
for i, ch in enumerate(line):
    if ch == '*':
        continue
    d = int(ch)
    total += d if i % 2 == 0 else d * 3

r = (10 - (total % 10)) % 10
if star_pos % 2 == 0:
    x = r
else:
    x = (7 * r) % 10

print(x)