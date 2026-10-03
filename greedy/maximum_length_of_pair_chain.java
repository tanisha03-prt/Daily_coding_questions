package greedy;

import java.util.Arrays;

public class maximum_length_of_pair_chain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int count = 0;
        int lastEnd = Integer.MIN_VALUE;
        for (int[] pair : pairs) {
            if (pair[0] > lastEnd) {
                count++;
                lastEnd = pair[1];
            }
        }
        return count;
    }
}
