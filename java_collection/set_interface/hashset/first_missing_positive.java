package java_collection.queue.set_interface.hashset;
import java.util.*;
public class first_missing_positive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        Set<Integer> set = new HashSet<>();
        for(int x:arr) set.add(x);
        int i=1;
        while(true){
            if(!set.contains(i)){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
