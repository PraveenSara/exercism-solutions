codes = {
    'black' : '0',
    'brown' : '1',
    'red' : '2',
    'orange' : '3',
    'yellow' : '4',
    'green' : '5',
    'blue' : '6',
    'violet' : '7',
    'grey' : '8',
    'white' : '9'
}

def label(colors):

    #result = ''
    ohm = int(codes[colors[0]] + codes[colors[1]] + '0' * int(codes[colors[2]]))
    
    str_ohm = str(ohm)

    if str_ohm.count('0') <= 1:
        return f'{str_ohm} ohms'
    elif str_ohm.count('0') <= 4:
        return f'{str_ohm[:-3]} kiloohms'
    elif str_ohm.count('0') <= 8:
        return f'{str_ohm[:-6]} megaohms'
    else:
        return f'{str_ohm[:-9]} gigaohms'
    
