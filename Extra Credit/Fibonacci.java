import java.util.HashMap;
public class Fibonacci {
    public static int fib(int n){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        return fib_helper(n, map);
    }
    public static int fib_helper(int n, HashMap<Integer,Integer> map){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        if (map.containsKey(n))
            return map.get(n);
        int fibnum = fib_helper(n-2,map)+fib_helper(n-1,map);
        map.put(n, fibnum);
        return fibnum;
    }

    public static void main(String[] args){
        System.out.println(fib(15));
        System.out.println(fib(3));
    }
}