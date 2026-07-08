package prefix_sum;

import java.util.HashMap;
import java.util.Map;

public class subarray_sum_divisible_by_k {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int count = 0;
        for(int i : nums){
            sum += i;
            int rem = sum%k;
            rem = (rem + k) % k;
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}
