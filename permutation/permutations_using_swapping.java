package permutation;

public class permutations_using_swapping {
    static void perm(char arr[], int index)
    {
        if(index == arr.length)
        {
            System.out.println(String.valueOf(arr));
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            perm(arr,index+1);

            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args)
    {
        perm("ABC".toCharArray(),0);
    }
}
