package java_collection.queue.queue_interface.Array_deque;

import java.util.*;
public class insert_at_both {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(23);
        dq.addLast(45);
        System.out.println(dq);
    }
    
}
