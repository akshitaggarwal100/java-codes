import math
def factors2(number):
    nums = set()
    for i in range(1, math.ceil(math.sqrt(number))):
        if (number % i == 0):
            nums.add(i)
            nums.add(number // i)
    return nums
        

def cp(n1, n2):
    return factors2(n1).intersection(factors2(n2))

print(cp(24, 34))