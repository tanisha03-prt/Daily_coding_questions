package greedy;

import java.util.Arrays;

public class merge_intervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) ->
            Integer.compare(a[0], b[0]));
        if (intervals.length == 0) {
            return new int[0][];
        }
        int[][] ans = new int[intervals.length][2];
        int index = 0;
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                ans[index][0] = start;
                ans[index][1] = end;
                index++;
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        ans[index][0] = start;
        ans[index][1] = end;
        index++;
        return Arrays.copyOf(ans, index);
    }
}
