package prefix_sum;
import java.util.*;
public class prefix_sum_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,3,5};
        int[] prefix_sum = new int[arr.length];
        prefix_sum[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix_sum[i] = prefix_sum[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(prefix_sum));
    }
}
