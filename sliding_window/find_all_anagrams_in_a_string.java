package sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class find_all_anagrams_in_a_string {
    public List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new ArrayList<>();

        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();

        // Frequency of p
        for (char ch : p.toCharArray()) {
            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Window size > p.length()
            if (right - left + 1 > p.length()) {

                char c = s.charAt(left);

                map.put(c, map.get(c) - 1);

                if (map.get(c) == 0) {
                    map.remove(c);
                }

                left++;
            }

            // Window size == p.length()
            if (right - left + 1 == p.length()) {

                if (map.equals(pMap)) {
                    result.add(left);
                }
            }
        }

        return result;
    }
}
