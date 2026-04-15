package stack;

import java.util.Stack;

public class next_smaller_right_side {
    public static int[] nextSmaller(int[] arr){
    int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,5,7,3};
        int[] ans = nextSmaller(arr);
        for(int i:ans){
            System.out.println(i + " ");
        }
    }
}
    
    

