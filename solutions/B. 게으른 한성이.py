import sys
input = sys.stdin.readline

a,b=map(int,input().split())

print(min(b-1,a-b))