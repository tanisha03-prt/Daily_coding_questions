package Priority_Queue;

import java.util.PriorityQueue;

public class kth_largest_element_in_an_array {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : nums){
            pq.offer(x);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
