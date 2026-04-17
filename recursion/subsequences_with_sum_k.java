package recursion;

import java.util.ArrayList;
import java.util.List;

public class subsequences_with_sum_k {
    static void subsequence(int i, int[] arr, List<Integer> ds, int sum, int k){
        if(i == arr.length){
            if(sum == k){
                System.out.println(ds);
            }
            return;
        }

        // pick
        ds.add(arr[i]);
        sum += arr[i];
        subsequence(i + 1, arr, ds, sum, k);

        // backtrack
        sum -= arr[i];
        ds.remove(ds.size() - 1);

        // not pick
        subsequence(i + 1, arr, ds, sum, k);
    }

    public static void main(String[] args){
        int[] arr = {1,2,1};
        int k = 2;
        subsequence(0, arr, new ArrayList<>(), 0, k);
    }
    
}
