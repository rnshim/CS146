import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Courses {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, Integer> in_deg = new HashMap<Integer, Integer>();
        HashMap<Integer, ArrayList<Integer>> neighbors = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i<numCourses; i++){
            in_deg.put(i, 0);
            neighbors.put(i, new ArrayList<Integer>());
        }
        for (int[] pair:prerequisites){
            in_deg.put(pair[0], in_deg.get(pair[0])+1);
            neighbors.get(pair[1]).add(pair[0]);
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i<numCourses; i++){
            if (in_deg.get(i)==0)
                q.add(i);
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (!q.isEmpty()){
            int course = q.remove();
            result.add(course);
            for (int neighbor: neighbors.get(course)){
                in_deg.put(neighbor, in_deg.get(neighbor)-1);
                if (in_deg.get(neighbor)==0)
                    q.add(neighbor);
            }
        }
        if (result.size()!=numCourses)
            return false;
        return true;
    }
    public static void main(String[] args){
        Courses c = new Courses();
        int[][] p1 = {{1,0}};
        System.out.println(c.canFinish(2, p1));
        int[][] p2 = {{1,0},{0,1}};
        System.out.println(c.canFinish(2, p2));
    }
}
