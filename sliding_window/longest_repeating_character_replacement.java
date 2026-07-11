package sliding_window;

import java.util.HashMap;

public class longest_repeating_character_replacement {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int res = 0;
        int left = 0;
        int maxFreq = 0;
        for(int right = 0 ; right< s.length() ; right++){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq, map.get(ch));
            if((right - left +1) - maxFreq>k){
                char c = s.charAt(left);
                map.put(c, map.get(c) - 1);
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
