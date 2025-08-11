# 1. 함수의 return 값을 맞출 것
# 2. 숫자를 찾았으면 바로 산술
# 3. 전부 단어인 경우는 있을 수 없음

import sys
# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

lines = [line.strip() for line in sys.stdin.readlines()]
A, B, C = lines

# def getFizzBuzz (number):
#     if number % 3 == 0 and number % 5 == 0:
#         return "FizzBuzz"
#     elif number % 3 == 0 and number % 5 != 0:
#         return "Fizz"
#     elif number % 3 != 0 and number % 5 == 0:
#         return "Buzz"
#     else:
#         return number

# index = 0
# number = 0
# for i in range(len(lines)):
#     if lines[i].isdigit():
#         index = i
#         number = int(lines[i])
#         break

# fizzBuzz = ''
# while(index <= 3):
#     fizzBuzz = getFizzBuzz(number)
#     number += 1
#     index += 1

# print(fizzBuzz)

def getFizzBuzz(number):
    if number % 15 == 0:
        return "FizzBuzz"
    elif number % 3 == 0:
        return "Fizz"
    elif number % 5 == 0:
        return "Buzz"
    else:
        return str(number)
    
def is_num(s: str) -> bool:
    return s.isdigit()

index = -1
number = None
for i in range(len(lines)):
    if lines[i].isdigit():
        index = i
        number = int(lines[i])
        break

if index != -1:    
    shift = 3 - index
    print(getFizzBuzz(number + shift))