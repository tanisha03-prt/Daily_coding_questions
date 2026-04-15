package java_collection.queue.list_interface.array_list;
import java.util.*;
public class reverse_list {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(20);
        ar.add(234);
        ar.add(67);
        ar.add(123);
        for(int i=ar.size() - 1;i>=0;i--){
            System.out.println(ar.get(i));
        }
    }


    
}
