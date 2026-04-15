package java_collection.queue.queue_interface.circular_queue;

public class implementation {
    static class CircularQueue{
        int[] arr;
        int front,rear,size;
        CircularQueue(int size){
            this.size = size;
            arr = new int[size];
            front = -1;
            rear = -1;
        }
        void enqueue(int x){
            if((rear+1)%size == front){
                return;
            }
            if(front == -1) front = 0;
            rear = (rear+1) % size;
            arr[rear] = x;
        }
        int dequeue(){
            if(front == -1) return -1;
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front+1) % size;
            }
            return arr[front];
        }
        int peek(){
            return arr[front];
        }
        boolean isEmpty(){
            return front == -1;
        }
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display(); // 10 20 30 40

        q.dequeue();
        q.dequeue();

        q.display(); // 30 40

        q.enqueue(50);
        q.enqueue(60); // wrap around

        q.display();
    }
}
