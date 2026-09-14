package hash_table;

import java.util.HashSet;
import java.util.Set;

public class longest_consecutive_sequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxLen = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int length = 1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                maxLen = Math.max(maxLen,length);
            }
        }
        return maxLen;
    }
}
