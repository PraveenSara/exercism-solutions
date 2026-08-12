def line_up(name, number):

    suffix = '-'

    if str(number)[-1] == '1' and str(number)[-2:] != '11':
        suffix = 'st'
    elif str(number)[-1] == '2' and str(number)[-2:] != '12':
        suffix = 'nd'
    elif str(number)[-1] == '3' and str(number)[-2:] != '13':
        suffix = 'rd'
    else:
        suffix = 'th'

    return f"{name}, you are the {number}{suffix} customer we serve today. Thank you!"