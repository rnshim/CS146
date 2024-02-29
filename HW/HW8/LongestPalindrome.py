class LongestPalindrome:
    def longestPalindrome(self, s):
        if len(s)==0 or len(s)==1:
            return len(s)
        map = {}
        
        for char in s:
            if char in map:
                map[char]+=1
            else:
                map[char]=1
        maxchar = None
        for char in s:
            if map[char] % 2 == 1 and (maxchar is None or map[char] > map[maxchar]):
                maxchar = char
        
        if maxchar in map:
            longest = map[maxchar]
            map[maxchar]=0
        else:
            longest=0
        
        for char in map.keys():
            if map[char]%2==1:
                longest+=map[char]-1
            else:
                longest+=map[char]
        return longest

a = LongestPalindrome()
print(a.longestPalindrome(""))
print(a.longestPalindrome("abccccdd"))
print(a.longestPalindrome("speediskey"))
print(a.longestPalindrome("bb"))
            
