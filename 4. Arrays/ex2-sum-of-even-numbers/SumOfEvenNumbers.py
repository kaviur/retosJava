from typing import List

def sum_of_even_numbers(array: List[int]) -> int:
    if array is None or len(array) == 0:
        return 0
    return sum((x for x in array if x % 2 == 0))

# print(sum_of_even_numbers([-2,10,0,5]))
