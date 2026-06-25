package graph_theory;
import java.util.*;
public class rotten_oranges {

    class Pair {
        int i;
        int j;
        int time;

        Pair(int i, int j, int time) {
            this.i = i;
            this.j = j;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        int fresh = 0;

        // Push all rotten oranges into queue
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 2) {
                    q.offer(new Pair(i, j, 0));
                    visited[i][j] = true;
                }
                else if(grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int[][] dir = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        int time = 0;
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int row = curr.i;
            int col = curr.j;
            int t = curr.time;
            time = Math.max(time, t);
            for(int[] d : dir) {
                int nr = row + d[0];
                int nc = col + d[1];
                if(nr >= 0 && nc >= 0 &&
                   nr < n && nc < m &&
                   grid[nr][nc] == 1 &&
                   !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    fresh--;
                    q.offer(new Pair(nr, nc, t + 1));
                }
            }
        }

        if(fresh != 0) {
            return -1;
        }
        return time;
    }
}