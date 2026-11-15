package Dynamic_Programming;

public class climbing_stairs {
    public int climb(int n){
        if(n<=1){
            return 1;
        }
        int[] dp = new int[n+1];
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
