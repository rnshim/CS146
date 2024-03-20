package HW.HW11;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialcolor = image[sr][sc];
        HashSet<Integer[]> set = new HashSet<Integer[]>();
        Queue<Integer[]> q = new LinkedList<Integer[]>();
        q.add(new Integer[]{sr,sc});
        image[sr][sc]=color;
        while (!q.isEmpty()){
            Integer[] popped = q.poll();
        }

        return null;

    }
    boolean isValid(int x, int y, int[][] image, int initialcolor, HashSet<Integer[]> set) {
        Integer[] coords = {x,y};
        if (0 <= x && x < image.length && 0 <= y && y < image[0].length && !set.contains(coords)&&image[x][y]==initialcolor) {
            return true;
        }
        else
            return false;
    }
}