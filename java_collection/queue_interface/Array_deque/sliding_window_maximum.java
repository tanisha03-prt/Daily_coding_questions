package java_collection.queue.queue_interface.Array_deque;
import java.util.*;
public class sliding_window_maximum {
    public static void main(String[] args) {
        int[] arr = {1,4,7,3,6,7,34};
        int k  = 3;
    
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()]<arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(i>=k-1){
                System.out.println(arr[dq.peekFirst()] + " ");
            }
        }

    }
    
}
