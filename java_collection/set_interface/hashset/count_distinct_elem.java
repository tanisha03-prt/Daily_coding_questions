package java_collection.queue.set_interface.hashset;
import java.util.*;

public class count_distinct_elem {
    public static void main(String[] args) {

        int[] arr = {23, 21, 5, 23, 21, 10};

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        System.out.println(set.size());
    }
}
