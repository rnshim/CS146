import java.util.HashMap;

public class IsAnagram {
    public static boolean is_anagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++){
            if (map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
            } else {
                map1.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++){
            if (map1.containsKey(t.charAt(i))){
                map1.put(t.charAt(i), map1.get(t.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        for (int i : map1.values()){
            if (i != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(is_anagram("ssat", "sat"));
        System.out.println(is_anagram("triangle", "integral"));
        System.out.println(is_anagram("bah", "ahb"));
    }

}

