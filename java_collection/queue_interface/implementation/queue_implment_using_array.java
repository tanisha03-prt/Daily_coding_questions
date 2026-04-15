package java_collection.queue.queue_interface.implementation;

public class queue_implment_using_array {
    int[] arr;
    int front;
    int rear;
    int size;
    queue_implment_using_array(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    void enqueue(int x){
        if(rear == size-1) return;
        if(front == -1) front = 0;
        rear = rear+1;
        arr[rear] = x;
    }
    int dequeue(){
        if(front == -1 || front>rear){
            return -1;
        }
        return arr[front++];
    }
    int peek(){
        if(front == -1 || front>rear) return -1;
        return arr[front];
    }
    
}
