def is_armstrong_number(number):
    num_in_string = str(number)
    num_length = len(num_in_string)
    num = 0
    for digit in num_in_string:
        num += int(digit)**num_length

    return number == num
