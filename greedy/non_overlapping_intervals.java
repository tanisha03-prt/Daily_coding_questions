package greedy;

import java.util.Arrays;

public class non_overlapping_intervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            return a[1]-b[1];});
        int res=0;
        int end=intervals[0][1];        
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
                res++;
            }else{
                end=intervals[i][1];
            }
        }
        return res;
    }
}
