package stack;

class Node {
    int data;
    Node next;

    Node(int data) {

        this.data = data;
        this.next = null;

        
    }
}

class StackLL {
    Node top;

    // constructor
    StackLL() {
        top = null;
        
    }

    // push
    void push(int x) {
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
        
    }

    // pop
    int pop() {
        if(isEmpty()) return -1;
        int val = top.data;
        top = top.next;
        return val;
        
    }

    // peek
    int peek() {
        if(isEmpty()) return -1;
        return top.data;
        
    }

    // isEmpty
    boolean isEmpty() {
        return(top == null);
        
    }
    // display
    void display() {
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        
    }
}

public class implementation_using_linkedList {
    public static void main(String[] args) {

        StackLL st = new StackLL();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.pop());
        System.out.println(st.peek());

        st.display();
    }
}
