package HW11;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialcolor = image[sr][sc];
        HashSet<String> set = new HashSet<String>();
        Queue<Integer[]> q = new LinkedList<Integer[]>();
        q.add(new Integer[]{sr,sc});
        image[sr][sc]=color;
        set.add(sr + "," + sc);
        while (!q.isEmpty()) {
            Integer[] popped = q.poll();
            int a = popped[0];
            int b = popped[1];
            if (isValid(a, b + 1, image, initialcolor, set)) {
                image[a][b + 1] = color;
                q.add(new Integer[]{a, b + 1});
                set.add(a + "," + (b + 1));
            }
            if (isValid(a, b - 1, image, initialcolor, set)) {
                image[a][b - 1] = color;
                q.add(new Integer[]{a, b - 1});
                set.add(a + "," + (b - 1));
            }
            if (isValid(a + 1, b, image, initialcolor, set)) {
                image[a + 1][b] = color;
                q.add(new Integer[]{a + 1, b});
                set.add((a + 1) + "," + b);
            }
            if (isValid(a - 1, b, image, initialcolor, set)) {
                image[a - 1][b] = color;
                q.add(new Integer[]{a - 1, b});
                set.add((a - 1) + "," + b);
            }
        }
        return image;

    }
    public boolean isValid(int x, int y, int[][] image, int initialcolor, HashSet<String> set) {
        String coords = x + "," + y;
        if (0 <= x && x < image.length && 0 <= y && y < image[0].length && !set.contains(coords) && image[x][y] == initialcolor) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        FloodFill ff = new FloodFill();
        int[][] l1 = {{1,1,1},{1,1,0},{1,0,1}};
        int[][] l2 = {{0,0,0},{0,0,0}};

        int[][] result1 = ff.floodFill(l1, 1, 1, 2);
        int[][] result2 = ff.floodFill(l2, 0, 0, 0);

        System.out.println("Result 1:");
        for (int[] row : result1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("Result 2:");
        for (int[] row : result2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}