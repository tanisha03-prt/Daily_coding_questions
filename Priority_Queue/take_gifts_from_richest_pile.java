package Priority_Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class take_gifts_from_richest_pile {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : gifts){
            pq.add(i);
        }
        while(k != 0){
            int x = pq.poll();
            x = (int) Math.sqrt(x);
            pq.add(x);
            k--;
        }
        long sum = 0;
        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        return sum;
    }
}
