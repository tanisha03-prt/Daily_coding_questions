package prefix_sum;

public class range_sum_array {
    public int[] pre;
    public range_sum_array(int[] nums) {
        int n = nums.length;
        pre = new int[n];
        pre[0] = nums[0];
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1] + nums[i]; 
        }
    }
    public int sumRange(int left, int right) {
        if(left == 0) return pre[right];
        return pre[right] - pre[left-1];
    }
}
