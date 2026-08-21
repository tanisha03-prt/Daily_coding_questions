package Dynamic_Programming;
import java.util.Arrays;
public class max_length_of_pair_chain {
    int[][] dp;
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        // Sort pairs by first element
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        dp = new int[n][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(0, -1, pairs);
    }
    private int solve(int i, int prev, int[][] pairs) {
        // Base case
        if (i == pairs.length) {
            return 0;
        }
        // Already calculated
        if (dp[i][prev + 1] != -1) {
            return dp[i][prev + 1];
        }
        // Option 1: Skip current pair
        int skip = solve(i + 1, prev, pairs);
        // Option 2: Take current pair
        int take = 0;
        if (prev == -1 || pairs[prev][1] < pairs[i][0]) {
            take = 1 + solve(i + 1, i, pairs);
        }
        return dp[i][prev + 1] = Math.max(take, skip);
    }
}
