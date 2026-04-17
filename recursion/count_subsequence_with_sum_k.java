package recursion;

public class count_subsequence_with_sum_k {
    static int countSubsequence(int i, int[] arr, int sum, int k){
        if(i == arr.length){
            if(sum == k) return 1;
            else return 0;
        }

        // pick
        sum += arr[i];
        int left = countSubsequence(i + 1, arr, sum, k);

        // backtrack
        sum -= arr[i];

        // not pick
        int right = countSubsequence(i + 1, arr, sum, k);

        return left + right;
    }

    public static void main(String[] args){
        int[] arr = {1,2,1};
        int k = 2;
        System.out.println(countSubsequence(0, arr, 0, k));
    }
    
}
