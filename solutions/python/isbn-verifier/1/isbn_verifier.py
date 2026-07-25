def is_valid(isbn):

    isbn_nums = str(isbn).replace("-","")
    
    if len(isbn_nums) != 10:
        return False

    
    total = 0
    digit = 10

    for num in isbn_nums:
        if num.isnumeric():
            total += int(num) * digit
            digit -= 1

        elif isbn_nums.endswith("X"):
            total += 10 * digit
            digit -= 1

        else:
            return False

    return total % 11 == 0
