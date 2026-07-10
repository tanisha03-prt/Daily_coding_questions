package sliding_window;
public class number_of_nice_subarrays{
    public int number(int[] nums, int k){
        return atMost(nums,k) - atMost(nums,k-1);
    }
    private int atMost(int[] nums, int k){
        int count = 0;
        int left = 0;
        int odd = 0;
        for(int right = 0; right<nums.length; right++){
            if(nums[right]%2!=0){
                odd++;
            }
            while(odd>k){
                if(nums[left]%2!=0){
                    odd--;
                }
                left++;
            }
            count+= right-left+1;
        }
        return count;
    }
}