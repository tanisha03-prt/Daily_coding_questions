package greedy;

import java.util.Arrays;

public class maximum_units_on_a_truck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1] - a[1]);
        int total = 0;
        for(int[] box : boxTypes){
            int take = Math.min(box[0],truckSize);
            total += take*box[1];
            truckSize -= take;
            if(truckSize == 0){
                break;
            }
        }
        return total;
    }
}
