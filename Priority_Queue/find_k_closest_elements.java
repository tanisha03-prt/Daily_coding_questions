package Priority_Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class find_k_closest_elements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int diff = Math.abs(b - x) - Math.abs(a - x);
            if (diff == 0) {
                return b - a;
            }
            return diff;
        });
        for(int i : arr){
            pq.add(i);
            if(pq.size() > k){
                pq.poll();
            }
        }
        List<Integer> list = new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll());
        }
        Collections.sort(list);
        return list;
    }
}
