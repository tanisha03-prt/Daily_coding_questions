package graph_theory;

public class number_of_islands {
    public int numIsIslands(char[][] grid){
        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c] == '1'){
                    dfs(grid,r,c);
                    islands++;
                }
            }
        }
        return islands;
    }
    private void dfs(char[][] grid, int r, int c){
        int rows = grid.length;
        int cols = grid[0].length;
        if(r<0 || c<0 || r>=rows || c>=cols || grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';
        dfs(grid, r + 1, c); // down
        dfs(grid, r - 1, c); // up
        dfs(grid, r, c + 1); // right
        dfs(grid, r, c - 1); // left
    }
}
