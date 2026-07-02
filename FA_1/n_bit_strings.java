package FA_1;

import java.util.Scanner;

public class n_bit_strings {

    static void generate(int n, int pos, int index, String current) {
        // base case
        if (index == n) {
            System.out.println(current);
            return;
        }
        // if this is the fixed position → only '1'
        if (index == pos) {
            generate(n, pos, index + 1, current + "1");
        } else {
            // try '0'
            generate(n, pos, index + 1, current + "0");

            // try '1'
            generate(n, pos, index + 1, current + "1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();

        generate(n, pos, 0, "");
    }
}