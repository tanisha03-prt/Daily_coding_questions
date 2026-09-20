package hash_table;
import java.util.HashMap;
import java.util.Map;
public class character_with_maximum_frequency {
    public static char maxFrequency(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    for(char ch : s.toCharArray()) {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    char answer = '\0';
    int max = 0;
    for(Map.Entry<Character, Integer> entry : map.entrySet()) {
        if(entry.getValue() > max) {
            max = entry.getValue();
            answer = entry.getKey();
        }
    }
    return answer;
}
}
