package Arrays_;

import java.util.HashMap;
import java.util.Map;

public class contains_duplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0) return false;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int integer = nums[i];
            if(map.containsKey(integer) && i-map.get(integer) <= k){
                return true;
                
            }
            map.put(integer,i);
        }
        return false;
    }
}
