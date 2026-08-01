package Two_pointer;
import java.util.*;
public class Three_sum {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums){
        int n = nums.length;
        if(n<3){
            return new ArrayList<>();
        }
        result.clear();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = -nums[i];
            twoSum(nums,target,i+1,n-1);
        }
        return result;
    }
    private void twoSum(int[] nums,int target, int i, int j){
        while(i<j){
            if(nums[i] + nums[j] < target){
                i++;
            }else if(nums[i] + nums[j] > target){
                j--;
            }else{
                while(i<j && nums[i] == nums[i+1]){
                    i++;
                }
                while(i<j && nums[j] == nums[j-1]){
                    j--;
                }
                result.add(Arrays.asList(-target,nums[i],nums[j]));
            }
        }
    }
}
