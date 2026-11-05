package Priority_Queue;

import java.util.PriorityQueue;

public class remove_smallest_elem_k_times {
    public void remove(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : arr){
            pq.add(num);
        }
        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            System.out.println("Removed: " + pq.poll());
        }
    }
}
