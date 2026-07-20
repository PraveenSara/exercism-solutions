def response(hey_bob):
    
    match hey_bob:
    
        case s if s.isupper() and s.endswith("?"):
            return "Calm down, I know what I'm doing!"
        case s if s.strip().endswith("?"):
            return "Sure."
            
        case s if s.isupper():
            return "Whoa, chill out!"

        case s if s.strip() == "":
            return "Fine. Be that way!"

        case _:
            return "Whatever."

    
    
