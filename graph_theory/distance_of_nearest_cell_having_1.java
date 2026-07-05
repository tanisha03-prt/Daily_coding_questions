package graph_theory;
import java.util.*;
public class distance_of_nearest_cell_having_1 {
    class Pair{
        int row;
        int col;
        int dist;
        Pair(int row, int col, int dist){
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }
    public int[][] nearest(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int[][] ans = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    q.offer(new Pair(i,j,0));
                    visited[i][j] = true;
                }
            }
        }
        int[][] dir = {{0,1},{-1,0},{1,0},{0,-1}};
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int r = curr.row;
            int c = curr.col;
            int dist = curr.dist;
            ans[r][c] = dist;
            for(int[] d : dir) {
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr >= 0 && nc >= 0 && nr < n && nc < m && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    q.offer(new Pair(nr,nc,dist + 1));
                }
            }
        }
        return ans;
    }
}




