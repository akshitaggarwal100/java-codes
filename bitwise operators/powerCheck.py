def checker(number):
    """
    this function checks whether the given number is perfect power of 2 or not
    it takes a number and returns boolean
    """
    
    cnt = 0
    while number > 0:
        temp = number & 1
        if temp == 1:
            cnt += 1
            if cnt > 1:
                return False
        number >>= 1
    return True

def checker2(number):
    if number == 0:
        return False
    return number & (number - 1) == 0

print(checker2(0))