import java.util.Arrays;

public class City {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n];
        int city = 0, smallest = n;
        for (int[] row : dist)
            Arrays.fill(row, 10001);
        for (int[] edge : edges)
            dist[edge[0]][edge[1]] = dist[edge[1]][edge[0]] = edge[2];
        for (int i = 0; i < n; ++i)
            dist[i][i] = 0;
        for (int k = 0; k < n; ++k)
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; ++j)
                if (dist[i][j] <= distanceThreshold)
                    ++count;
            if (count <= smallest) {
                city = i;
                smallest = count;
            }
        }
        return city;
    }
    public static void main(String[] args){
        City c = new City();

        int[][] t1 = {{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}};
        int result1 = c.findTheCity(4, t1, 4);
        System.out.println(result1);

        int[][] t2 = {{0, 1, 2}, {0, 4, 8}, {1, 2, 3}, {1, 4, 2}, {2, 3, 1}, {3, 4, 1}};
        int result2 = c.findTheCity(5, t2, 2);
        System.out.println(result2);
    }
}