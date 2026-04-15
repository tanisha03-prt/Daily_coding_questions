package java_collection.queue.queue_interface.Array_deque;
import java.util.*;
public class even_num_remove {
    public static void main(String[] args) {
        Deque<Integer>dq = new ArrayDeque<>();
        dq.add(12);
        dq.add(56);
        dq.add(31);
        dq.add(55);

        for(int i=0;i<dq.size();i++){
            int x = dq.removeFirst();
            if(x%2!=0){
                dq.addLast(x);
            }
        }
        System.out.println(dq);
    }
    
}
