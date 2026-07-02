package recursion;

import java.util.ArrayList;
import java.util.List;

public class combination_sum {
    static void combinationSum(int i, int[] arr, int target, List<Integer> ds){
        
        // base case
        if(i == arr.length){
            if(target == 0){
                System.out.println(ds);
            }
            return;
        }

        // pick (if possible)
        if(arr[i] <= target){
            ds.add(arr[i]);
            combinationSum(i, arr, target - arr[i], ds); // SAME index
            ds.remove(ds.size() - 1); // backtrack
        }

        // not pick
        combinationSum(i + 1, arr, target, ds);
    }

    public static void main(String[] args){
        int[] arr = {2,3,6,7};
        int target = 7;

        combinationSum(0, arr, target, new ArrayList<>());
    }
    
}
