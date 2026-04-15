package java_collection.queue.list_interface.array_list;
import java.util.*;

public class sum_of_elem {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        int sum = 0;

        for(int i : l){
            sum += i;
        }

        System.out.println(sum);
    }
}