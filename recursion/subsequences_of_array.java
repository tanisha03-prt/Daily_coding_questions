package recursion;

import java.util.ArrayList;
import java.util.List;

public class subsequences_of_array {
    static void subsequence(int i, int[] arr, List<Integer> ds){
        if(i == arr.length){
            System.out.println(ds);
            return;
        }

        // pick
        ds.add(arr[i]);
        subsequence(i + 1, arr, ds);

        // backtrack
        ds.remove(ds.size() - 1);

        // not pick
        subsequence(i + 1, arr, ds);
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
        subsequence(0, arr, new ArrayList<>());
    }
}





// class Main
// {
//     static void sub(int arr[], int i, String ans)
//     {
//         if(i == arr.length)
//         {
//             System.out.println(ans);
//             return;
//         }
//         sub(arr, i + 1, ans + arr[i] + " ");
//         sub(arr, i + 1, ans);
//     }

//     public static void main(String[] args)
//     {
//         int arr[] = {1,2,3};
//         sub(arr,0,"");
//     }
// }