package stack;
import java.util.*;
public int maxGrowth(int[] prices) {
    int n = prices.length;
    Stack<Integer> st = new Stack<>();
    int maxSpan = 0;

    for(int i = 0; i < n; i++) {

        while(!st.isEmpty() && prices[st.peek()] < prices[i]) {
            st.pop();
        }

        int span;
        if(st.isEmpty()) {
            span = i + 1;
        } else {
            span = i - st.peek();
        }

        maxSpan = Math.max(maxSpan, span);

        st.push(i);
    }

    return maxSpan;
}