def counter(n):
    cnt = 0
    while n > 0:
        cnt += 1
        n >>= 1
    return cnt

def counter1(number, base):
    from math import log
    return int(log(number) / log(base) + 1)

print(counter(8))