def is_pangram(sentence):
    
    lst = []
    lowercase_alp = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']

    for alphabet in sentence.lower():
        if alphabet not in lst and alphabet in lowercase_alp:
            lst.append(alphabet)
        else:
            continue
            

    return sorted(lst) == lowercase_alp
