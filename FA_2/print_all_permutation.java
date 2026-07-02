package FA_2;

import java.util.Arrays;
import java.util.Scanner;

public class print_all_permutation {
    static void permute(char[] arr,int index){
        if(index == arr.length){
            System.out.println(new String(arr));
            return;
        }
        for(int i=index;i<arr.length;i++){
            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            permute(arr,index+1);

            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] arr = s.toCharArray();

        Arrays.sort(arr); // for lexicographical order

        permute(arr, 0);
    }
    
}
