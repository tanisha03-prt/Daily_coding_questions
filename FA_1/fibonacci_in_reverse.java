package FA_1;

import java.util.Scanner;

public class fibonacci_in_reverse {

    // Recursive function (optimized)
    static void printReverse(int n, int a, int b) {
        if (n == 0) return;

        printReverse(n - 1, b, a + b); // aage badho
        System.out.println(a);         // wapas aate waqt print (reverse)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // input

        printReverse(n, 0, 1);
    }
}