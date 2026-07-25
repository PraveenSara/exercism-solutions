def is_isogram(phrase):
    
    char_in_phrase = []
    
    for char in phrase.lower():
        if char.isalpha():
            if char in char_in_phrase:
                return False
            char_in_phrase.append(char)

    return True
