n = int(input())
m = int(input()) % 4

if m % 2 == 0:
    flag = (m == 0)
    for i in range(n + flag):
        print("* " * (n + 1 - flag))
else:
    flag = (m == 3)
    for i in range(n):
        for j in range(n - flag, i, -1):
            print(" ", end=" ")
        for j in range(i * 2 + 1):
            print("*", end=" ")
        print()
    flag = not flag
    for i in range(n - 1, -1, -1):
        for j in range(n - flag, i, -1):
            print(" ", end=" ")
        for j in range(i * 2 + 1):
            print("*", end=" ")
        print()
