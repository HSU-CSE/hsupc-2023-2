import sys
input = sys.stdin.readline

PLUS = 500 #기본적으로 인덱스 값

T = int(input())
for Case in range(1,T+1):
    N=int(input())
    Numbers = [0]*(1003) #쌍들을 배열로 저장
    cnt=0
    for num in input().split():
        num = int(num)
        cnt+=Numbers[196-num + PLUS]
        Numbers[num+PLUS]+=1
    print(f'Case #{Case} : {cnt}')