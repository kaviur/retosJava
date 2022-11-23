def getSumCheckArray(array):  # int[]
    results = [False, False]

    if len(array) > 2:
        for idx in range(2, len(array)):
            results.append(sum(array[idx - 2 : idx]) == array[idx])

    return results


if __name__ == "__main__":
    array = [1, -1, 0, 4, 6, 10, 15, 25]
    print(getSumCheckArray(array))
