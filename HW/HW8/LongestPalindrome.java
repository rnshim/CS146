package HW.HW8;
import java.util.HashMap;
import java.util.Set;
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int longest = 0;
        if (s.length()==0)
            return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i),1);
        }
        char maxchar = '!';
        for (int i=0;i<s.length();i++){
            if (map.get(s.charAt(i))%2==1 && (maxchar=='!'||map.get(s.charAt(i))>map.get(maxchar)))
                maxchar=s.charAt(i);
        }
        if (map.containsKey(maxchar)){
            longest=map.get(maxchar);
            map.remove(maxchar);
        }
        Set<Character> keys = map.keySet();
        for (Character c: keys){
            if (map.get(c)%2==1)
                longest+=map.get(c)-1;
            else
                longest+=map.get(c);
        }
        return longest;
    }
    public static void main(String[] args){
        LongestPalindrome a = new LongestPalindrome();
        System.out.println(a.longestPalindrome(""));
        System.out.println(a.longestPalindrome("abccccdd"));
        System.out.println(a.longestPalindrome("speediskey"));
        System.out.println(a.longestPalindrome("bb"));
    }
}
