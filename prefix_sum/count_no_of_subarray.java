package prefix_sum;

import java.util.HashMap;

public class count_no_of_subarray {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int count = 0;
        int oddCount = 0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            if(nums[i] % 2 !=0){
                oddCount++;
            }
            if(map.containsKey(oddCount - k)){
                count += map.get(oddCount-k);
            }
            map.put(oddCount, map.getOrDefault(oddCount, 0) + 1);
        }
        return count;
    }
}
