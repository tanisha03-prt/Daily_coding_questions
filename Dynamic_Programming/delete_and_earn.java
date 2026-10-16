package Dynamic_Programming;
public class delete_and_earn {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] points = new int[max + 1];

        // Same values ke points combine karo
        for (int num : nums) {
            points[num] += num;
        }

        // House Robber DP
        int[] dp = new int[max + 1];
        dp[0] = 0;
        if (max >= 1) {
            dp[1] = points[1];
        }
        for (int i = 2; i <= max; i++) {
            int take = points[i] + dp[i - 2];
            int skip = dp[i - 1];
            dp[i] = Math.max(take, skip);
        }
        return dp[max];
    }
}
