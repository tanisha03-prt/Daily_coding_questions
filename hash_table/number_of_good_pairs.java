package hash_table;

import java.util.HashMap;

public class number_of_good_pairs {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int x : nums) {
            if(map.containsKey(x)) {
                count += map.get(x);
            }
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        return count;
    }
}
