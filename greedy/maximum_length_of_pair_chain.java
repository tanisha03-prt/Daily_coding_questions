package greedy;

import java.util.Arrays;

public class maximum_length_of_pair_chain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->Integer.compare(a[1],b[1]));
        if(pairs.length == 0) return 0;
        int len = 1;
        int lastChain = pairs[0][1];
        for(int i=0; i<pairs.length; i++){
            if(pairs[i][0] > lastChain){
                len++;
                lastChain = pairs[i][1];
            }
        }
        return len;
    }
}
