package sliding_window;

public class max_sum_subrray_of_size_k {
    public int maxSum(int[] nums, int k){
        int n = nums.length;
        int sum = 0;
        int maxSum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        maxSum = sum;
        for(int i=k;i<n;i++){
            sum += nums[i];
            sum -= nums[i-k];
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
