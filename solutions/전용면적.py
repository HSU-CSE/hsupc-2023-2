import math

def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
    return True

n = int(input())

result = n
for _ in range(n):
    n = int(input()) * 2 + 1
    if is_prime(n):
        result -= 1

print(result)
