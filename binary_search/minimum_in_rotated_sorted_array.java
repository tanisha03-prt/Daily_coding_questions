package binary_search;

public class minimum_in_rotated_sorted_array {
    public int min(int[] arr, int n){
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[low] <= arr[mid]){
                ans = Math.min(ans,arr[low]);
                low = mid + 1;
            }else{
                ans = Math.min(ans,arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
}
