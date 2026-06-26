package graph_theory;

public class flood_fill_algo {
    public int[][] floodFill(int[][] image,int sr, int sc, int color){
        int origColor = image[sr][sc];
        if(origColor == color) return image;
        dfs(image,sr,sc,origColor,color);
        return image;
    }
    private void dfs(int[][] image, int r, int c, int origColor, int color){
        int rows = image.length;
        int cols = image[0].length;
        if(r<0 || c<0 || r>=rows || c>=cols || image[r][c] != origColor){
            return;
        }
        image[r][c] = color;
        dfs(image,r+1,c,origColor,color);
        dfs(image,r-1,c,origColor,color);
        dfs(image,r,c+1,origColor,color);
        dfs(image,r,c-1,origColor,color);
    }
}
