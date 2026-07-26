def rotate(text, key):
    
    result = ""
    
    for _ in text:
        if _.isalpha():
            if _.isupper():
                shift = chr((ord(_)-ord('A') + key) % 26 + ord('A'))
                result += shift
            else:
                shift = chr((ord(_)-ord('a') + key) % 26 + ord('a'))
                result += shift

        else:
            result += _

    return result
    
