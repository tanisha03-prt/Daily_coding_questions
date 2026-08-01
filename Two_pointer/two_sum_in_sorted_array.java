package Two_pointer;

public class two_sum_in_sorted_array {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] arr = new int[2];
        int left = 0;
        int right = n-1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(target == sum){
                arr[0] = left + 1;
                arr[1] = right + 1;
                break;
            }else if(target > sum){
                left++;
            }else{
                right--;
            }
        }
        return arr;
    }
}
