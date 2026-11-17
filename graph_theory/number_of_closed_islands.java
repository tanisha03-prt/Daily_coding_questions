package graph_theory;

public class number_of_closed_islands {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0; i<n; i++){
            if(grid[i][0] == 0) dfs(grid,i,0);
            if(grid[i][m-1] == 0) dfs(grid,i,m-1);
        }
        for(int i=0; i<m; i++){
            if(grid[0][i] == 0) dfs(grid,0,i);
            if(grid[n-1][i] == 0) dfs(grid,n-1,i);
        }
        int closeIsland = 0;
        for(int i=1; i<n-1; i++){
            for(int j=1; j<m-1; j++){
                if(grid[i][j] == 0){
                    closeIsland ++;
                    dfs(grid,i,j);
                }
            }
        }
        return closeIsland;
    }
    private void dfs(int[][] grid, int r, int c){
        int row = grid.length;
        int col = grid[0].length;
        if(r<0 || r>=row || c<0 || c>=col || grid[r][c] == 1){
            return;
        }
        grid[r][c] = 1;
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
}
