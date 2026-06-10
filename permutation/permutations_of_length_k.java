package permutation;

public class permutations_of_length_k {
    static void perm(String str, String ans, int k)
    {
        if(ans.length() == k)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            perm(left + right,
                 ans + ch,k);
        }
    }

    public static void main(String[] args)
    {
        perm("ABC","",2);
    }
}
