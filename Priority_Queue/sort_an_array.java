package Priority_Queue;

import java.util.PriorityQueue;

public class sort_an_array {
    public void sort(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.add(num);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pq.poll();
        }
    }
}
