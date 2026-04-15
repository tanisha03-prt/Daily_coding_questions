package java_collection.queue.set_interface.hashset;
import java.util.*;
public class intersection {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        // store elements of nums1
        for (int i : nums1) {
            set1.add(i);
        }

        // check common elements
        for (int i : nums2) {
            if (set1.contains(i)) {
                resultSet.add(i);
            }
        }

        // convert set to array
        int[] result = new int[resultSet.size()];
        int index = 0;

        for (int num : resultSet) {
            result[index++] = num;
        }

        // print result
        System.out.println(Arrays.toString(result));
    }
}
