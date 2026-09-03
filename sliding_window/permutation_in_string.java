package sliding_window;

import java.util.HashMap;

public class permutation_in_string {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }
        int left = 0;
        int matched = 0;
        for (int right = 0; right < s2.length(); right++) {
            char ch = s2.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            // Agar required frequency ke equal ho gayi
            if (need.containsKey(ch) &&
                window.get(ch).equals(need.get(ch))) {
                matched++;
            }

            // Window size > s1 length
            if (right - left + 1 > s1.length()) {
                char c = s2.charAt(left);
                // Agar remove karne se frequency required
                // value se neeche chali jayegi
                if (need.containsKey(c) &&
                    window.get(c).equals(need.get(c))) {
                    matched--;
                }
                window.put(c, window.get(c) - 1);
                if (window.get(c) == 0) {
                    window.remove(c);
                }
                left++;
            }

            // Saari required frequencies match ho gayi
            if (matched == need.size()) {
                return true;
            }
        }
        return false;
    }
}
