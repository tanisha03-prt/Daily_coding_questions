package Priority_Queue;

import java.util.HashMap;
import java.util.PriorityQueue;

public class sort_characters_by_freq{
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(!maxHeap.isEmpty()){
            char ch = maxHeap.poll();
            int count = map.get(ch);
            for(int i=0; i<count; i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}