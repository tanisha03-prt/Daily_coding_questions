package sliding_window;

public class maximum_average_subarray {
    public double avg(int[] nums, int k){
        int sum = 0;
        int maxSum = 0;
        int n = nums.length;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        maxSum = sum;
        for(int i=k;i<n;i++){
            sum -= nums[i-k];
            sum += nums[i];
            maxSum = Math.max(sum,maxSum);
        }
        return (double)maxSum/k;
    }
}
