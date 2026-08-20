def sum_of_multiples(limit, multiples):

    result = set()
    
    for multiple in multiples:

        if (multiple == 0) or (multiple > limit):
            continue
        
        for i in range(multiple, limit, multiple):
            result.add(i)

    return sum(result)