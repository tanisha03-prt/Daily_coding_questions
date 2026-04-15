package java_collection.queue.queue_interface.implementation;

class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class implement_using_linkedList {
    Node front;
    Node rear;
    void enqueue(int x){
        Node newNode = new Node(x);
        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    int dequeue(){
        if(front == null) return-1;
        int val = front.data;
        front = front.next;
        if(front == null) rear = null;
        return val;
    }
    int peek(){
        if(front == null) return -1;
        return front.data;
    }

    
}
