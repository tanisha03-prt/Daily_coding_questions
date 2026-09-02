package sliding_window;

public class minimum_size_subarray_sum {
    public int minSize(int target, int[] nums){
        int minLen = Integer.MAX_VALUE;
        int left = 0 ;
        int sum = 0;
        for(int right=0;right<nums.length;right++){
            sum+= nums[right];
            while(sum>= target){
                minLen = Math.min(right-left+1,minLen);
                sum-=nums[left];
                left++;
            }
        }
        return minLen;
    }
}
