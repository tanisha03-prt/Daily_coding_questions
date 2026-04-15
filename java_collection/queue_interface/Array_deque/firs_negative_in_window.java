package java_collection.queue.queue_interface.Array_deque;
import java.util.*;
public class firs_negative_in_window {
    public static void main(String[] args) {
        int[] arr = {1,3,45,-5,7,8,-2,5,67,-1};
        int k = 3;
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()] < 0){
                dq.addLast(i);
            }
            dq.addLast(i);
        
        if(i >= k-1){
            System.out.println(arr[dq.peekFirst()] + " ");
        }
        }
    }
    
}
