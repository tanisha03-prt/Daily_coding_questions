package graph_theory;
import java.util.*;
public class number_of_enclaves {
    class Pair {
        int row;
        int col;
        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    public int numEnclaves(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        Queue<Pair> q = new LinkedList<>();

        // First Row and Last Row
        for (int j = 0; j < cols; j++) {
            if (grid[0][j] == 1 && !visited[0][j]) {
                q.offer(new Pair(0, j));
                visited[0][j] = true;
            }
            if (grid[rows - 1][j] == 1 && !visited[rows - 1][j]) {
                q.offer(new Pair(rows - 1, j));
                visited[rows - 1][j] = true;
            }
        }

        // First Column and Last Column
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 1 && !visited[i][0]) {
                q.offer(new Pair(i, 0));
                visited[i][0] = true;
            }
            if (grid[i][cols - 1] == 1 && !visited[i][cols - 1]) {
                q.offer(new Pair(i, cols - 1));
                visited[i][cols - 1] = true;
            }
        }
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        while (!q.isEmpty()) {
            Pair node = q.poll();
            int row = node.row;
            int col = node.col;
            for (int k = 0; k < 4; k++) {
                int newRow = row + delRow[k];
                int newCol = col + delCol[k];
                if (newRow >= 0 && newRow < rows &&
                    newCol >= 0 && newCol < cols &&
                    grid[newRow][newCol] == 1 &&
                    !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    q.offer(new Pair(newRow, newCol));
                }
            }
        }
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
