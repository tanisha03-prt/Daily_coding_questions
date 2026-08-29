package sliding_window;

public class longest_nice_subarray {
    public int longestNiceSubarray(int[] nums) {

        int left = 0;
        int usedBits = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            // Jab tak current number ki koi bit
            // window mein already present hai
            while ((usedBits & nums[right]) != 0) {

                // Left wale number ki bits remove karo
                usedBits ^= nums[left];
                left++;
            }

            // Current number ko window mein add karo
            usedBits |= nums[right];

            // Maximum length update
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }

}
