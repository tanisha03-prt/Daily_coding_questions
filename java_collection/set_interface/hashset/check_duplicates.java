package java_collection.queue.set_interface.hashset;

import java.util.*;

public class check_duplicates {
    public static void main(String[] args) {

        int[] arr = {1,2,34,2,3,5,6,7};
        Set<Integer> set = new HashSet<>();

        boolean hasDuplicate = false;

        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i])){
                hasDuplicate = true;
                break;
            }
            set.add(arr[i]);
        }

        if(hasDuplicate){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
