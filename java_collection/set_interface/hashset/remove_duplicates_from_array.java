package java_collection.queue.set_interface.hashset;

import java.util.Arrays;
import java.util.HashSet;

public class remove_duplicates_from_array {
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();
        int[] arr = {12,3,4,2,3,5,6};
        for(int i:arr){
            set.add(i);
        }
        int[] ans = new int[set.size()];
        int k = 0;
        for(int i:set){
            ans[k++] = i; 
        }
        System.out.println(Arrays.toString(ans));
    }
    
}
