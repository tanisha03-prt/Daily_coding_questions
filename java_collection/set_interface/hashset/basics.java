package java_collection.queue.set_interface.hashset;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(21);
        set.add(5);
        set.add(23);
        System.out.println(set);
        System.out.println(set.contains(23));
        System.out.println(set.size());
        System.out.println(set.remove(5));
        for(int i:set){
            System.out.println(i);
        }
    }
    
}
