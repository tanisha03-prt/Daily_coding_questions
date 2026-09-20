package Strings;

import java.util.HashMap;

public class count_words_in_a_sentence {
    public static HashMap<String, Integer> wordFrequency(String s) {
    HashMap<String, Integer> map = new HashMap<>();
    String[] words = s.split(" ");
    for(String word : words) {
        map.put(word, map.getOrDefault(word, 0) + 1);
    }
    return map;
}
}
