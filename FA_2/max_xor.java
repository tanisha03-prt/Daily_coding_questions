package FA_2;

import java.util.Scanner;

public class max_xor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int x = A ^ B;

        int result = 0;

        // make all bits 1 till highest set bit
        while (x > 0) {
            result = (result << 1) | 1;
            x = x >> 1;
        }

        System.out.println(result);
    }
}
