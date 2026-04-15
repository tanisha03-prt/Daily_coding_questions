package java_collection.queue.queue_interface.Array_deque;
import java.util.*;
public class count_greater_than_x {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(23);
        dq.add(56);
        dq.add(13);
        dq.add(78);
        int count = 0;
        int x = 23;
        int s = dq.size();
        for(int i=0;i<s;i++){
            if(dq.removeFirst() > x){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
