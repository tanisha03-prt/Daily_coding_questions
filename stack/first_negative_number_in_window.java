package stack;
import java.util.*;
public class first_negative_number_in_window {
    public static int[] negativeNumber(int[] arr){
        Deque<Integer> dq = new ArrayDeque<>();
        int k = 3;
        for(int i=0;i<arr.length;i++){
            while(!dq.isEmpty() && dq.peekFirst()<= i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[dq.removeLast()] < 0){
                dq.addLast(i);
            }
            dq.addLast(i);
            if(i >= i-k){
                System.out.println(arr[dq.peekFirst()] + " ");
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        
        int[] ans = negativeNumber(arr);
        for(int i:ans){
            System.out.println(i + " ");
        }

    }
    
}
