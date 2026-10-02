package greedy;
import java.util.*;
class Solution {
    static class Job {
        int id;
        int deadline;
        int profit;
        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void jobScheduling(Job[] jobs) {
        // Highest profit first
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }
        boolean[] slot = new boolean[maxDeadline + 1];
        int count = 0;
        int totalProfit = 0;
        for (Job job : jobs) {
            // Deadline se backwards free slot dhundo
            for (int j = job.deadline; j >= 1; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    count++;
                    totalProfit += job.profit;
                    break;
                }
            }
        }
        System.out.println("Jobs done = " + count);
        System.out.println("Total profit = " + totalProfit);
    }
}