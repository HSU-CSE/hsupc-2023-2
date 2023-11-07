import sys
input = sys.stdin.readline


T = int(input())
for Case in range(1,T+1):
    N = int(input())
    Numbers={} #쌍들을 해시로 저장
    cnt=0
    for num in input().split():
        num = int(num)
        cnt+=Numbers.get(196-num,0)
        Numbers[num]=Numbers.get(num,0)+1
    print(f'Case #{Case} : {cnt}')