package greedy;
import java.util.*;
public class meeting_room {
    public boolean canAttend(int[][] meetings){
        Arrays.sort(meetings,(a,b)->a[0] - b[0]);
        for(int i=1; i<meetings.length; i++){
            if(meetings[i][0] < meetings[i-1][1]){
                return false;
            }
        }
        return true;
    }
}
