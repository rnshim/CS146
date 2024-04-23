package HW12;
import java.util.Arrays;

public class Water {
    private int[] ps;
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        ps = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ps[i] = i;
        }

        int[][] es = new int[pipes.length + wells.length][3];
        int index = 0;
        for (int[] pipe : pipes) {
            es[index++] = new int[]{pipe[2], pipe[0] - 1, pipe[1] - 1};
        }
        for (int i = 0; i < wells.length; i++) {
            es[index++] = new int[]{wells[i], i, n};
        }

        Arrays.sort(es, (a, b) -> Integer.compare(a[0], b[0]));

        int cost = 0;
        for (int[] edge : es) {
            int c = edge[0], u = edge[1], v = edge[2];
            if (union(u, v)) {
                cost += c;
            }
        }
        return cost;
    }

    private int find(int x) {
        if (x != ps[x]) {
            ps[x] = find(ps[x]);
        }
        return ps[x];
    }

    private boolean union(int x, int y) {
        int r1 = find(x);
        int r2 = find(y);
        if (r1 != r2) {
            ps[r2] = r1;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Water water = new Water();
        System.out.println(water.minCostToSupplyWater(2, new int[]{1, 1}, new int[][]{{1, 2, 1}, {1, 2, 2}}));
    }
}