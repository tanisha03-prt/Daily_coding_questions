package FA_2;

import java.util.*;

public class Merge_two_sorted_arrays {

    // function to merge two sorted arrays (descending)
    static void merge(int[] a, int[] b) {
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                System.out.print(a[i++] + " ");
            } else {
                System.out.print(b[j++] + " ");
            }
        }

        while (i < a.length) {
            System.out.print(a[i++] + " ");
        }

        while (j < b.length) {
            System.out.print(b[j++] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        merge(a, b); // function call
    }
}