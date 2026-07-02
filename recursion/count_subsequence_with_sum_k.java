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




// class Main
// {
//     static int count(int arr[], int i,
//                      int sum, int target)
//     {
//         if(i == arr.length)
//         {
//             if(sum == target)
//                 return 1;
//             return 0;
//         }
//         return count(arr,i+1,
//                      sum+arr[i],target)
//              + count(arr,i+1,
//                      sum,target);
//     }

//     public static void main(String[] args)
//     {
//         int arr[] = {1,2,1};
//         System.out.println(count(arr,0,0,2));
//     }
// }