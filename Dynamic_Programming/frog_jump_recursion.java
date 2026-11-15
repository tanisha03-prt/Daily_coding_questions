package Dynamic_Programming;

public class frog_jump_recursion {
    public boolean canCross(int[] stones){
        if(stones[1] != -1) return false;
        return solve(0,0,stones);
    }
    public boolean solve(int index, int lastJump, int[] stones){
        if(index == stones.length - 1) return true;
        for(int jump = lastJump - 1; jump <= lastJump + 1; jump ++){
            int nextPosition = stones[index] + jump;
            for (int j = index + 1; j < stones.length; j++) {
                if (stones[j] == nextPosition) {
                    if (solve(j, jump, stones)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
