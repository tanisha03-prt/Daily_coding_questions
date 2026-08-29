package sliding_window;

import java.util.HashMap;

public class number_of_good_subarray {
    public long countGood(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        long ans = 0;
        long pairs = 0;

        for (int right = 0; right < nums.length; right++) {

            int num = nums[right];

            // New num ke saath jitne same elements hain,
            // utne naye pairs banenge
            pairs += map.getOrDefault(num, 0);

            map.put(num, map.getOrDefault(num, 0) + 1);

            // Jab pairs >= k ho gaya,
            // tab current window good hai
            while (pairs >= k) {

                ans += nums.length - right;

                int leftNum = nums[left];

                // leftNum ko remove karne se
                // uske saath banne wale pairs remove honge
                map.put(leftNum, map.get(leftNum) - 1);

                pairs -= map.get(leftNum);

                if (map.get(leftNum) == 0) {
                    map.remove(leftNum);
                }

                left++;
            }
        }

        return ans;
    }
}
