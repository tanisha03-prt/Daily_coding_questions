package sliding_window;

import java.util.HashMap;

public class subarrays_with_k_distinct_integers {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subAtMost(nums,k) - subAtMost(nums, k-1);
    }
    public int subAtMost(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;
        for(int right = 0;right<nums.length;right++){
            map.put(nums[right] , map.getOrDefault(nums[right],0)+1);

            while(map.size() > k){
                map.put(nums[left] , map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            ans+= right-left+1;
        }
        return ans;
    }
}
