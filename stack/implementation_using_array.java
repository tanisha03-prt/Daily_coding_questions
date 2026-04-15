package stack;
import java.util.*;

class StackArray {
    int top;
    int size;
    int[] arr;

    // constructor
    StackArray(int size) {
        top = -1;
        this.size = size;
        arr = new int[size];
        
    }
    // push
    void push(int x) {
        if(isFull()) return;
        top=top+1;
        arr[top] = x;
        
    }
    // pop
    int pop() {
        if(top == -1) return -1;
        return arr[top--];
        
    }

    // peek
    int peek() {
        if(top == -1) return -1;
        return arr[top];
        
    }

    // isEmpty
    boolean isEmpty() {
        return(top == -1);
        
    }

    // isFull
    boolean isFull() {
        return(top == size-1);
        
    }

    // display
    void display(){
        for(int i=top; i>=0; i--){
            System.out.println(i+" ");
        }
    }
}
public class implementation_using_array {
    public static void main(String[] args) {
        
        StackArray st = new StackArray(5);
        st.push(23);
        st.push(10);
        st.push(30);

        System.out.println(st.pop());
        System.out.println(st.peek());

        
    }
    
}
