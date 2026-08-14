def append(list1, list2):
    return list1 + list2


def concat(lists):
    
    result = []

    for item in lists:
        result = append(result, item)

    return result
        
def filter(function, list):
    fun = function
    result = []
    for item in list:
        if fun(item):
            result = append(result, [item])
    return result


def length(list):
    count = 0
    
    for item in list:
        count += 1 

    return count

def map(function, list):
    fun = function

    result = []

    for item in list:
        ans = fun(item)
        result = append(result, [ans])
        
    return result

def foldl(function, list, initial):
    result = initial
    for num in list:
        result = function(result, num)
    return result


def foldr(function, list, initial):

    result = initial

    for num in list[::-1]:
        result = function(result, num)

    return result


def reverse(list):
    result = []
    
    for ind in range(len(list)-1, -1, -1):
        result = append(result, [list[ind]])
    
    return result
