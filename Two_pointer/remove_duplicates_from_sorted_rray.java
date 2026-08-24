package Two_pointer;

public class remove_duplicates_from_sorted_rray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0; j< nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
