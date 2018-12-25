def trim(s):
    if s[0] == " " and s[-1] == " ":
        return s[1:-1]
    elif s[0] == " ":
        return s[1:]
    elif s[-1] == " ":
        return s[:-1]
    else:
        return s
