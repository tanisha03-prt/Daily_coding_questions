package Two_pointer;

public class container_with_most_water {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int len = Math.min(height[left], height[right]);
            int width = right - left;
            int area = len * width;
            max = Math.max(max, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
