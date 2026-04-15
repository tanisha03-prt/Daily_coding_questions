package java_collection.queue.queue_interface.Array_deque;

import java.util.*;
public class reverse_deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(24);
        dq.add(12);
        dq.add(78);
        dq.add(12);

        while(!dq.isEmpty()){
            System.out.println(dq.removeLast() + " ");
        }

    }
    
}
