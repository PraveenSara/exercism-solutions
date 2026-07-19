def steps(number):
    count = 0
    num = number

    while num != 1:
        if num <= 0:
            raise ValueError("Only positive integers are allowed")
            
        elif num % 2 == 0:
            num //= 2
            count += 1
            
        else:
            num = (num * 3) + 1
            count += 1
            
    return count
