package sliding_window;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class count_complete_subarrays_in_an_array {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int distinct = set.size();
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;
        for(int right = 0; right < nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);
            while(map.size() == distinct){
                ans += nums.length - right;
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
        }
        return ans;
    }
}
