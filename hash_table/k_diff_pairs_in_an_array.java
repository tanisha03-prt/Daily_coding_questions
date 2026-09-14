package hash_table;

import java.util.HashMap;
import java.util.Map;

public class k_diff_pairs_in_an_array {
    public int findPairs(int[] nums, int k) {
        //int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int res = 0;
        for(int key : map.keySet()){
            if(k>0 && map.containsKey(key+k) || k==0 && map.get(key) > 1){
                res++;
            }
        }
        return res;
    }
}
