def is_palindrome(s):
    s = s.lower()
    stack = []
    regular = ""
    reversed = ""
    for char in s:
        if char.isalnum():
            stack.append(char)
            regular += char
    while len(stack)>0:
        reversed += stack.pop()
    if (regular==reversed):
        return True
    return False
print(is_palindrome("raaah"))
print(is_palindrome("Bub"))
print(is_palindrome("a@aa"))
print(is_palindrome(""))