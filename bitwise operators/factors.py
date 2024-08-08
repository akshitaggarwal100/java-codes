import math
def factors(number):
    for i in range(1, number + 1):
        if (number % i == 0):
            print(i)

def factors2(number):
    nums = []
    for i in range(1, math.ceil(math.sqrt(number))):
        if (number % i == 0):
            if (number / i == i):
                print(i)
            else:
                print(i)
                nums.append(number // i)
    for j in range(len(nums) - 1, 0, -1):
        print(nums[j])

factors2(32)