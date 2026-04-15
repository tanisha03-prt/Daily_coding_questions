package stack;
import java.util.*;
public class next_greater_left {
    public static int[] nextGreater(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && st.peek()<=arr[i]){
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
        int[] arr = {1,3,5,5,7,3};
        int[] ans = nextGreater(arr);
        for(int i:ans){
            System.out.println(i + " ");
        }
    }
}
