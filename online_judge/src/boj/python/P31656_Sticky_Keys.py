# 1. re는 파이썬의 정규표현식 모듈
# 2. (.) -> 어떤 문자든 한 글자를 캡처
# 3. \1+ -> 바로 뒤에 같은 문자가 한 번 이상 반복되는 경우

import sys
import re

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

S = input().rstrip()
print(re.sub(r'(.)\1+', r'\1', S))