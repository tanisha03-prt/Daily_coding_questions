package graph_theory;

public class num_of_enclaves {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            if(grid[i][0] == 1) dfs(grid,i,0);
            if(grid[i][m-1] == 1) dfs(grid,i,m-1);
        }
        for(int j=0;j<m;j++){
            if(grid[0][j] == 1) dfs(grid,0,j);
            if(grid[n-1][j] == 1) dfs(grid,n-1,j);
        }
        int enclaves = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    enclaves ++;
                }
            }
        }
        return enclaves;
    }
    private void dfs(int[][] grid, int r, int c){
        int row = grid.length;
        int col = grid[0].length;
        if(r<0 || r>=row || c<0 || c>=col || grid[r][c] != 1){
            return;
        }
        grid[r][c] = 0;
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
}
