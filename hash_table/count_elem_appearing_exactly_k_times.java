package hash_table;
import java.util.*;
public class count_elem_appearing_exactly_k_times {
    public int count(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == k){
                count++;
            }
        }
        return count;
    }
}
