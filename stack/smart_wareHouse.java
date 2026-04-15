package stack;
import java.util.*;
public class smart_wareHouse {
    boolean possible(int[] arrival,int[] dispatch){
        Stack<Integer>st = new Stack<>();
        int j = 0;
        for(int i=0;i<arrival.length;i++){
            st.push(arrival[i]);
            while(!st.isEmpty() && st.peek() == dispatch[j]){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
    
}
