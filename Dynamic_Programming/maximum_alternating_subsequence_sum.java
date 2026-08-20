package Dynamic_Programming;
import java.util.Arrays;
public class maximum_alternating_subsequence_sum {
    long[][] dp;
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        dp = new long[n][2];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Long.MIN_VALUE);
        }
        return solve(0, 1, nums);
    }
    private long solve(int i, int sign, int[] nums) {
        if (i == nums.length) {
            return 0;
        }
        if (dp[i][sign] != Long.MIN_VALUE) {
            return dp[i][sign];
        }
        long skip = solve(i + 1, sign, nums);
        long take;
        if (sign == 1) {
            take = nums[i] + solve(i + 1, 0, nums);
        } else {
            take = -nums[i] + solve(i + 1, 1, nums);
        }
        return dp[i][sign] = Math.max(take, skip);
    }
}
