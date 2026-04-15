package java_collection.queue.queue_interface.Array_deque;
import java.util.*;

public class basic {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(20);
        dq.add(10);
        dq.add(30);

        System.out.println(dq);

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        dq.addFirst(6);
        dq.addLast(8);

        System.out.println(dq);

        System.out.println(dq.isEmpty());
    }
}
