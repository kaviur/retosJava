
from SumOfPrevious import getSumCheckArray

def test_multiple_cases():
    array = [1, -1, 0, 4, 6, 10, 15, 25]
    expected = [False, False, True, False, False, True, False, True]
    assert getSumCheckArray(array) == expected

    array = [1, -1, 10, 4, 14, 13, 15, 25]
    expected = [False, False, False, False, True, False, False, False]
    assert getSumCheckArray(array) == expected

    array = [1, -1, 10, 4, 6, 13, 15, 25]
    expected = [False, False, False, False, False, False, False, False]
    assert getSumCheckArray(array) == expected

def test_two_elements_array():
    assert getSumCheckArray([16, 8]) == [False, False]
