package hash_table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class find_players_with_zero_or_one_losses {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int[] match : matches){
            int winner = match[0];
            int loser = match[1];
            map.putIfAbsent(winner, 0);
            map.putIfAbsent(loser, 0);
            map.put(loser, map.get(loser) + 1);
        }
        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int player = entry.getKey();
            int losses = entry.getValue();
            if (losses == 0) {
                zeroLoss.add(player);
            }
            else if (losses == 1) {
                oneLoss.add(player);
            }
        }
        Collections.sort(zeroLoss);
        Collections.sort(oneLoss);
        return Arrays.asList(zeroLoss, oneLoss);
    }
}
