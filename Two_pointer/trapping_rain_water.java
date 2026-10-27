package Two_pointer;

public class trapping_rain_water {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;
        while(left<right){
            leftMax = Math.max(height[left],leftMax);
            rightMax = Math.max(height[right],rightMax);
            if(leftMax < rightMax){
                total += leftMax - height[left];
                left++;
            }else{
                total += rightMax - height[right];
                right--;
            }
        }
        return total;
    }
}
