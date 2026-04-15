package java_collection.queue.queue_interface.Array_deque;
import java.util.*;
public class remove_from_both {
    public static void main(String[] args) {
        Deque<Integer>dq = new ArrayDeque<>();
        dq.add(34);
        dq.add(4556);
        dq.add(21);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
    }
    
}
