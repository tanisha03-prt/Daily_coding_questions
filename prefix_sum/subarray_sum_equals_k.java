package prefix_sum;

import java.util.HashMap;
import java.util.Map;

public class subarray_sum_equals_k {
    public int sum(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int sum = 0;
        for(int i : arr){
            sum += i;
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
