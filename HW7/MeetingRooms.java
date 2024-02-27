package HW7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MeetingRooms {
    public int minMeetingRooms(List<List<Integer>> intervals) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (List<Integer> interval : intervals) {
                int startTime = interval.get(0);
                int endTime = interval.get(1);
                if (!minHeap.isEmpty() && minHeap.peek() <= startTime) {
                    minHeap.poll();
                }
                minHeap.offer(endTime);
            }
            return minHeap.size();
    }
    public static void main(String[] args){
        MeetingRooms a = new MeetingRooms();
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(0, 30));
        nums.add(Arrays.asList(5, 10));
        nums.add(Arrays.asList(15, 20));
        System.out.println(a.minMeetingRooms(nums));
        
        List<List<Integer>> nums2 = new ArrayList<>();
        nums2.add(Arrays.asList(0, 5));
        nums2.add(Arrays.asList(6, 10));
        nums2.add(Arrays.asList(11, 15));
        System.out.println(a.minMeetingRooms(nums2));

        List<List<Integer>> nums3 = new ArrayList<>();
        System.out.println(a.minMeetingRooms(nums3));
    }
}