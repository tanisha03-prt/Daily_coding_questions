package stack;

import java.util.*;

class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    // constructor
    MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    // push
    void push(int x) {
        st.push(x);

        if(minSt.isEmpty() || x <= minSt.peek()) {
            minSt.push(x);
        }
    }
    // pop
    int pop() {
        if(st.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int removed = st.pop();

        if(removed == minSt.peek()) {
            minSt.pop();
        }
        return removed;
    }

    // top
    int top() {
        if(st.isEmpty()) {
            return -1;
        }
        return st.peek();
    }

    // getMin
    int getMin() {
        if(minSt.isEmpty()) {
            return -1;
        }
        return minSt.peek();
    }
}

public class min_stack {
    public static void main(String[] args) {

        MinStack st = new MinStack();

        st.push(5);
        st.push(3);
        st.push(7);
        st.push(2);

        System.out.println("Min: " + st.getMin()); // 2

        st.pop();
        System.out.println("Min: " + st.getMin()); // 3

        st.pop();
        System.out.println("Top: " + st.top());    // 3
    }
}