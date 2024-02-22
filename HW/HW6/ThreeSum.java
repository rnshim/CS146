package HW.HW6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i<nums.length;i++){
            int left = i+1;
            int right = nums.length-1;
            if (i>0 && nums[i]==nums[i-1])
                continue;
            while (left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if (sum>0)
                    right-=1;
                else if (sum<0)
                    left+=1;
                else {
                    ArrayList<Integer> subanswer = new ArrayList<Integer>();
                    subanswer.add(nums[i]);
                    subanswer.add(nums[left]);
                    subanswer.add(nums[right]);
                    answer.add(subanswer);
                    left += 1;
                    while (left<right&&nums[left]==nums[left-1]){
                        left+=1;
                    }
                }

            }
        }
        return answer;

    }
    public static void main(String[] args){
        ThreeSum a = new ThreeSum();
        int[] nums = {-5,0,5,10,-10,0};
        int[] nums2 = {0,1,1};
        System.out.println(a.threeSum(nums));
        System.out.println(a.threeSum(nums2));
    }
}