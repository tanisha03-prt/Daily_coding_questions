package java_collection.queue.list_interface.array_list;
import java.util.*;
public class freq_count {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(23);
        s.add(34);
        s.add(2);
        s.add(2);
        int count = 0;
        for(int i:s){
            if(i == 2){
                count++;
            }
        }
        System.out.println(count);
    }
}
