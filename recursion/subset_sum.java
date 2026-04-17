package recursion;

public class subset_sum {
    static boolean subsetSum(int i, int[] arr, int sum, int k){
        if(sum == k) return true; // early stop

        if(i == arr.length) return false;

        // pick
        if(subsetSum(i + 1, arr, sum + arr[i], k)){
            return true;
        }

        // not pick
        if(subsetSum(i + 1, arr, sum, k)){
            return true;
        }

        return false;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
        int k = 5;
        System.out.println(subsetSum(0, arr, 0, k));
    }
    
}
