def is_anagram(s, t):
    if len(s)!=len(t):
        return False
    map = {}
    for i in range(len(s)):
        if s[i] in map:
            map[s[i]] = map[s[i]]+1
        else:
            map[s[i]] = 1
    
    for i in range(len(s)):
        if t[i] in map:
            map[t[i]] = map[t[i]]-1
        else:
            return False
    
    for i in map:
        if map[i] != 0:
            return False
    
    return True

print(is_anagram("ah", "ha"))
print(is_anagram("rah", "ha"))