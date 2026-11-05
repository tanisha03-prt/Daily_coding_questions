package Priority_Queue;

public class min_elem_in_array {
    public int min(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr){
            pq.add(i);
        }
        return pq.peek();
    }
}
