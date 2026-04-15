package java_collection.queue.set_interface.hashset;
import java.util.*;
public class union {
    public static void main(String[] args) {
        int[] arr = {12,3,4,5,6};
        int[] brr = {34,5,6,78};
        Set<Integer> set = new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        for(int x:brr){
            set.add(x);
        }
        System.out.println(set);
    }
    
}
