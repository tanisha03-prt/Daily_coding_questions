package hash_table;
import java.util.*;
public class count_freq_of_each_distinct_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        ArrayList<String> words = new ArrayList<>(map.keySet());

        // Sort according to required conditions
        Collections.sort(words, (a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a);
            }
            return a.compareTo(b);
        });
        for (String word : words) {
            System.out.println(word + " " + map.get(word));
        }
        sc.close();
    }
}
