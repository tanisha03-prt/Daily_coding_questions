package stack;

import java.util.*;

public class next_greater_element {

    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {
            // stack possible greatest elements store karega
            while(!st.isEmpty() && st.peek()<= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10, 8};

        int[] ans = nextGreater(arr);

        for(int i : ans) {
            System.out.print(i + " ");
        }
    }
}
