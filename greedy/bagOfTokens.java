package greedy;
import java.util.Arrays;
public class bagOfTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0;
        int right = tokens.length - 1;
        int score = 0;
        int maxScore = 0;
        while (left <= right) {
            if (power >= tokens[left]) {
                // Face Up
                power -= tokens[left];
                score++;
                left++;
                maxScore = Math.max(maxScore, score);
            } else if (score > 0) {
                // Face Down
                power += tokens[right];
                score--;
                right--;
            } else {
                break;
            }
        }
        return maxScore;
    }
}
