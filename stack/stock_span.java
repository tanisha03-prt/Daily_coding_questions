package stack;

import java.util.*;

public class stock_span {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++) {
            // pop smaller or equal elements
            while(!st.isEmpty() && prices[st.peek()] <= prices[i]) {
                st.pop();
            }
            // calculate span
            if(st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            // push current index
            st.push(i);
        }
        return span;
    }
    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] ans = calculateSpan(prices);

        for(int i : ans) {
            System.out.print(i + " ");
        }
    }
}