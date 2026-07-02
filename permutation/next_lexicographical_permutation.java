package permutation;

public class next_lexicographical_permutation {
    static void nextPermutation(int arr[])
    {
        int i = arr.length - 2;
       
        while(i >= 0 && arr[i] >= arr[i+1])     // Step 1
        {
            i--;
        }

        
        if(i >= 0)          // Step 2
        {
            int j = arr.length - 1;
            while(arr[j] <= arr[i])
            {
                j--;
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Step 3 reverse
        int start = i + 1;
        int end = arr.length - 1;

        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // print
        for(int x : arr)
        {
            System.out.print(x);
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,3};
        nextPermutation(arr);
    }

}
