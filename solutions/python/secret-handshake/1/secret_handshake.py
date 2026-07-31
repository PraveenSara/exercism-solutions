def commands(binary_str):

    result = []
    
    rev_binary_str = binary_str[::-1]

    if rev_binary_str[0] == '1':
        result.append("wink")
    if rev_binary_str[1] == '1':
        result.append("double blink")
    if rev_binary_str[2] == '1':
        result.append("close your eyes")
    if rev_binary_str[3] == '1':
        result.append("jump")
    if rev_binary_str[4] == '1':
        return result[::-1]

    return result
            
