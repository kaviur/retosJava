from SumOfEvenNumbers import sum_of_even_numbers


def test_multiple_cases():
    assert sum_of_even_numbers([1, 3, 2, 8, 15, 199]) == 10
    assert sum_of_even_numbers([1, 3, 2, 8, 198, 15]) == 208
    assert sum_of_even_numbers([1 for i in range(1000)]) == 0
    assert sum_of_even_numbers([2 for i in range(1000)]) == 2000
    assert sum_of_even_numbers([0 for i in range(1000)]) == 0


def test_null_or_empty_should_return_zero():
    assert sum_of_even_numbers(None) == 0
    assert sum_of_even_numbers([]) == 0
