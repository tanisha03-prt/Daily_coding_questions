package FA_1;

import java.util.Scanner;

public class all_string_n_bits {
    static void binary(int n, String ans)
    {
        if(ans.length() == n)
        {
            System.out.println(ans);
            return;
        }

        binary(n, ans + "0");

        binary(n, ans + "1");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        binary(n, "");
    }
}
