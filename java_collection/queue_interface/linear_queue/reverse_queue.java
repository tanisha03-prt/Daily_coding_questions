package java_collection.queue.queue_interface.linear_queue;
import java.util.*;

public class reverse_queue {
    static void reverse(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        reverse(q);

        System.out.println(q);

        
    }
    
}
