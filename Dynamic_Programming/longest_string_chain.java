package Dynamic_Programming;
import java.util.Arrays;
public class longest_string_chain {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b) -> a.length() - b.length());
        int n = words.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int ans = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(isPredecessor(words[j],words[i])){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
    private boolean isPredecessor(String prev,String curr){
        if (curr.length() != prev.length() + 1)
            return false;
        int i = 0;
        int j = 0;
        while (i < prev.length() && j < curr.length()) {
            if (prev.charAt(i) == curr.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == prev.length();
    }
}
