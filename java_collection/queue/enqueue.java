import java.util.*;
package java_collection.queue;
class Main{
    static int[] q = new int[5];
    static int front = -1;
    static int rear = -1;
    static void enqueue(int x){
        if((rear+1) % 5 == front){
            System.out.println("Overflow");
            return;
        }
        if(front == -1)
            front = 0;
        rear = (rear+1) % 5;
        q[rear] = x;
    }
    static void dequeue(){
        if(front == -1){
            System.out.println("Underflow");
            return;
        }
        if(front == rear){
            front = rear = -1;
            return;
        }
        front = (front+1) % 5;
    }
    static void display(){
        if(front == -1) return;
        int i = front;
        while(true){
            System.out.println(q[i] + " ");
            if(i == rear) break;
            i = (i+1) % 5;
        }
    }
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);

        dequeue();
        enqueue(40);

        display();
    }
}