def square(number):
    if number == 1:
        return 1
    if 2 <= number <= 64 :
        return 2 ** (number - 1)
    raise ValueError("square must be between 1 and 64")


def total():
    total_grain = 0

    for i in range(1,65):
        total_grain += square(i)

    return total_grain
