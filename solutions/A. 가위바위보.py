import sys
input = sys.stdin.readline

T = int(input())

for Case in range(1,T+1):
    N=int(input())
    cnt=0
    for _ in[0]*N:
        word=input().rstrip()
        if word=='가위바위보':
            cnt+=1
    print(f'Case #{Case} : {cnt}')