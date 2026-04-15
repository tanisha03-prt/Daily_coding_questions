package stack;
import java.util.*;
public class largest_rectangle_in_histogram {
    public static int large(int[] arr){
        int n = arr.length;
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        int currHeight;
        for(int i=0;i<arr.length;i++){
            if(i == n){
                currHeight = 0;
            }else{
                currHeight = arr[i];
            }
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                int height = arr[st.pop()];
                int width;
                if(st.isEmpty()){
                    width = i;
                }else{
                    width = i - st.peek() - 1;
                }
                int area = height * width;
                maxArea = Math.max(maxArea,area);

            }
            st.push(i);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,3,6,4};
        large(int[] arr);
        

    }
    
}
