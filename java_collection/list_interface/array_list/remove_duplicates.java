package java_collection.queue.list_interface.array_list;
import java.util.*;

public class remove_duplicates {
    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();
        ls.add(20);
        ls.add(23);
        ls.add(60);
        ls.add(20);

        Set<Integer> set = new HashSet<>(ls);

        ls = new ArrayList<>(set);

        System.out.println(ls);
    }
}
