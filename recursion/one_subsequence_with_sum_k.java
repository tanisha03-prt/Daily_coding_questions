package recursion;

import java.util.ArrayList;
import java.util.List;

public class one_subsequence_with_sum_k {
    static boolean subsequence(int i, int[] arr, List<Integer> ds, int sum, int k){
        if(i == arr.length){
            if(sum == k){
                System.out.println(ds);
                return true;
            }
            return false;
        }

        // pick
        ds.add(arr[i]);
        sum += arr[i];

        if(subsequence(i + 1, arr, ds, sum, k) == true){
            return true;
        }

        // backtrack
        sum -= arr[i];
        ds.remove(ds.size() - 1);

        // not pick
        if(subsequence(i + 1, arr, ds, sum, k) == true){
            return true;
        }

        return false;
    }

    public static void main(String[] args){
        int[] arr = {1,2,1};
        int k = 2;
        subsequence(0, arr, new ArrayList<>(), 0, k);
    }
    
}
