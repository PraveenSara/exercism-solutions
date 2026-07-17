def equilateral(sides):
    if sides[0] != 0:
        return (sides[0] == sides[1] and sides[0] == sides[2])
    return False


def isosceles(sides):
    if sides[0] == sides[1]:
        return sides[0]+sides[1] > sides[2]
    if sides[0] == sides[2]:
        return sides[0] + sides[2] > sides[1]
    if sides[1] == sides[2]:
        return sides[1] + sides[2] > sides[0]
    return False
        


def scalene(sides):
    a,b,c = sides

    valid_triangle =  (a + b >= c and a + c >= b and b + c >= a)
        
    all_different =  not (a == b or a == c or b == c)

    return valid_triangle and all_different
        
