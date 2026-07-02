package FA_1;

import java.util.Scanner;

public class all_string_n_bits_with_condition {
    static void binary(int n, int pos,
                       String ans)
    {
        if(ans.length() == n)
        {
            System.out.println(ans);
            return;
        }
        // fixed position must be 1
        if(ans.length() == pos)
        {
            binary(n, pos, ans + "1");
        }
        else
        {
            binary(n, pos, ans + "0");
            binary(n, pos, ans + "1");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int pos = sc.nextInt();

        binary(n, pos, "");
    }
}
