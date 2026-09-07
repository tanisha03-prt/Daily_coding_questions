package sliding_window;

public class min_operations_to_reduce_X_to_zero {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int target = sum - x;
        int maxLen = -1;
        int currSum = 0;
        int left = 0;
        for(int right= 0; right<nums.length; right++){
            currSum += nums[right];
            while(left <= right && currSum > target){
                currSum -= nums[left];
                left++;
            }
            if(currSum == target){
                maxLen = Math.max(maxLen,right-left+1);
            }
        }
        if(maxLen == -1){
            return -1;
        }
        return nums.length - maxLen;
    }
}
