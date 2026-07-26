def rotate(text, key):
    
    result = ''
    
    for ch in text:
        if ch.isalpha():
            if ch.isupper():
                shift = chr((ord(ch)-ord('A') + key) % 26 + ord('A'))
                result += shift
            else:
                shift = chr((ord(ch)-ord('a') + key) % 26 + ord('a'))
                result += shift

        else:
            result += ch

    return result
    
