package java_collection.queue.set_interface.hashset;

//package java_collection.queue.set_interface.hashset;

import java.util.*;

public class find_duplicate_number {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};

       Set<Integer> set = new HashSet<>();

       for(int x : arr){
         if(set.contains(x)){
         System.out.println(x);
         break;
    }
    set.add(x);
}
    }
}
