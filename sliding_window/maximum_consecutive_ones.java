package sliding_window;

public class maximum_consecutive_ones {
    public int longest(int[] nums, int k){
        int maxCount = Integer.MIN_VALUE;
        int zeroes = 0;
        int left = 0;
        int n = nums.length;
        for(int right = 0; right<n; right++){
            if(nums[right] == 0){
                zeroes++;
            }
            while(zeroes > k){
                if(nums[left] == 0 ){
                zeroes--;
            }
            left++;
        }
        maxCount = Math.max(maxCount,right - left + 1); 
    }
        return maxCount;
    }
}
