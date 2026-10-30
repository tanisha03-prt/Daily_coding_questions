package sliding_window;

public class number_of_subarrays_of_size_k_avg_greater_than_threshold {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        if(sum/k >= threshold){
            count++;
        }
        for(int i=k;i<arr.length;i++){
            sum += arr[i];
            sum -= arr[i-k];
            if(sum/k >= threshold){
                count++;
            }
        }
        return count;
    }
}
