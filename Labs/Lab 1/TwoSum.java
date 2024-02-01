import java.util.HashMap;
public class TwoSum {
    public static int[] twosum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target-nums[i]))
                return new int[]{i, map.get(target-nums[i])};
            else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
    public static void main(String[] args){
        int[] answer = twosum(new int[]{1,2,3,4}, 7);
        for (int e: answer){
            System.out.println(e);
        }
    }
}