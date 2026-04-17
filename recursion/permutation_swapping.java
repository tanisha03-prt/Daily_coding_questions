package recursion;

public class permutation_swapping {
    static void permute(char[] arr, int index){
        if(index == arr.length){
            System.out.println(new String(arr));
            return;
        }
        for(int i = index; i < arr.length; i++){
            // swap
            swap(arr, index, i);
            // recursion
            permute(arr, index + 1);
            // backtrack (undo swap)
            swap(arr, index, i);
        }
    }
    static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        String str = "abc";
        permute(str.toCharArray(), 0);
    }
}
