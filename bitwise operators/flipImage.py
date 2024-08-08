def flip(arr):
    start = 0
    end = len(arr) - 1
    while (start <= end):
        arr[start], arr[end] = arr[end], arr[start]
        arr[start] ^= 1
        arr[end] ^= 1
        start += 1
        end -= 1

arr = [
    [1, 1, 0],
    [1, 0, 1],
    [0, 0, 0]
]

for i in arr:
    flip(i)

print(arr)