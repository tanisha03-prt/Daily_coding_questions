package graph_theory;
import java.util.*;
public class rotten_oranges {

    class Pair {
        int r;
        int c;
        int time;

        Pair(int r, int c, int time) {
            this.r = r;
            this.c = c;
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
        for(int r = 0; r < n; r++) {
            for(int c = 0; c < m; c++) {
                if(grid[r][c] == 2) {
                    q.offer(new Pair(r, c, 0));
                    visited[r][c] = true;
                }
                else if(grid[r][c] == 1) {
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
            int row = curr.r;
            int col = curr.c;
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