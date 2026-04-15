package java_collection.queue.queue_interface.implementation;
import java.util.*;
public class implement_queue_using_stack {
    Stack<Integer>s1;
    Stack<Integer>s2;
    implement_queue_using_stack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    void enqueue(int x){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    int dequeue(){
        if(s1.isEmpty()) return -1;
        return s1.pop();
    }
    int peek(){
        if(s1.isEmpty()) return -1;
        return s1.peek();
    }
    boolean isEmpty(){
        return s1.isEmpty();
    }


    
}
