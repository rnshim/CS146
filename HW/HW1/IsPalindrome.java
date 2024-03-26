package HW1;

import java.util.Stack;

public class IsPalindrome {
    public static boolean is_palindrome(String s){
        String alpha = "";
        String reversed = "";
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i)) || (Character.isDigit(s.charAt(i)))){
                stack.push(s.charAt(i));
                alpha += s.charAt(i);
            }
        }
        while (!stack.isEmpty()){
            Character popped = stack.pop();
            reversed += popped;
        }
        if (alpha.equalsIgnoreCase(reversed))
            return true;
        return false;
    }
    public static void main(String[] args){
        System.out.println(is_palindrome("AAAAH123!"));
        System.out.println(is_palindrome("JIJ"));
        System.out.println(is_palindrome("121!"));
    }
}
