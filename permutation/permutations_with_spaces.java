package permutation;

public class permutations_with_spaces {
    static void solve(String str,
                      String ans)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        solve(str.substring(1),
              ans + " " + str.charAt(0));
        solve(str.substring(1),
              ans + str.charAt(0));
    }

    public static void main(String[] args)
    {
        String str = "ABC";
        solve(str.substring(1),
              "" + str.charAt(0));
    }
}
