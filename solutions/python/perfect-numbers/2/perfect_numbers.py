def classify(number):
    if number <= 0:
        raise ValueError("Classification is only possible for positive integers.")

    aliquot_sum = 0

    for num in range (1,number):
        if number % num == 0:
            aliquot_sum += num
      
    if aliquot_sum == number:
        return "perfect"
            
    if aliquot_sum < number:
        return "deficient"
            
    if number < aliquot_sum:
        return "abundant"

    raise ValueError("Classification is only possible for positive integers.")
