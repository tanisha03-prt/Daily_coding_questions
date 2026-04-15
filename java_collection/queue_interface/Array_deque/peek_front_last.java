package java_collection.queue.queue_interface.Array_deque;
import java.util.*;
public class peek_front_last {
    public static void main(String[] args) {
        Deque<Integer>dq = new ArrayDeque<>();
        dq.add(34);
        dq.add(4556);
        dq.add(21);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.isEmpty());
    }
    
}
