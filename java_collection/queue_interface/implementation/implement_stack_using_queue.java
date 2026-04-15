package java_collection.queue.queue_interface.implementation;

import java.util.*;
public class implement_stack_using_queue {
    Queue<Integer>q;
    implement_stack_using_queue(){
        q = new LinkedList<>();
    }
    void push(int x){
        q.offer(x);
        int s = q.size();
        for(int i=0;i<s-1;i++){
            q.offer(q.poll());
        }
    }
    int pop(){
        return q.poll();
    }
    boolean isEmpty(){
        return q.isEmpty();
    }
    int top(){
        return q.peek();
    }


    
}
