package binary_search;

public class first_occurence_of_an_elem_in_a_sorted_array {
    public int first(int[] nums, int target){
        int first = -1;
        int low = 0;
        int high = nums.length -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                first = mid;
                high = mid - 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return first;
    }
}
