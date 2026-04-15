package java_collection.queue.set_interface.hashset;
import java.util.*;
public class subarray_with_zero_sum {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,2,4,-2,-6,-1};
        boolean isFound = false;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
               if(sum == 0){
                isFound = true;
                break;
               }
            }
            if(isFound) break;
        }
        if(isFound){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    
}
