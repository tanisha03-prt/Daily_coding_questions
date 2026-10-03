package greedy;
import java.util.Arrays;
public class minimum_number_of_platforms {
    public int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0;
        int j = 0;
        int platforms = 0;
        int maxPlatforms = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                // New train arrives
                platforms++;
                i++;
                maxPlatforms = Math.max(maxPlatforms, platforms);
            } else {
                // Train departs
                platforms--;
                j++;
            }
        }
        return maxPlatforms;
    }
}
