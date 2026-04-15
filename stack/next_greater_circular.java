package stack;
import java.util.*;
public class next_greater_circular {
    public static int[] nextGreater(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        Arrays.fill(res,-1);
        for(int i=0; i<2*n; i++){
            int idx = i%n;
            while(!st.isEmpty() && arr[st.peek()] < arr[idx]){
                res[st.pop()] = arr[idx];
            }
            if(i<n){
                st.push(idx);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {12,4,6,4,43};
        int[] ans = nextGreater(arr);

        for(int i: ans){
            System.out.println(i + " ");
        }
        
    }
    
}
