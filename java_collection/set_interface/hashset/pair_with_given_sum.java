package java_collection.queue.set_interface.hashset;
import java.util.*;
public class pair_with_given_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 5;

        Set<Integer> set = new HashSet<>();

        for(int x : arr){
        int complement = target - x;
        if(set.contains(complement)){
            System.out.println(x + ", " + complement);
    }
    set.add(x);
        }
    }
    
}
