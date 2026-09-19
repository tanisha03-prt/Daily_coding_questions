package hash_table;
import java.util.*;
public class maximum_freq_element{
public int maxFreq(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i : nums) {
        map.put(i, map.getOrDefault(i, 0) + 1);
    }
    int max = 0;
    int element = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() > max) {
            max = entry.getValue();
            element = entry.getKey();
        }
    }
    return element;
}
}
