import sys

# input = sys.stdin.readline
sys.stdin = open('input.txt', 'r')

dic = {
    'w': 'chunbae',
    'b': 'nabi',
    'g': 'yeongcheol'
}

for line in sys.stdin:
    for i in line.split():
        if i in dic:
            print(dic[i])
            sys.exit()    