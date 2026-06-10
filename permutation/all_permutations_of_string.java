package permutation;

public class all_permutations_of_string {
    static void perm(String str, String ans)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            perm(left + right, ans + ch);
        }
    }

    public static void main(String[] args)
    {
        perm("ABC","");
    }
}
