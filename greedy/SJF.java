package greedy;
import java.util.*;
public class SJF {
    public static void main(String[] args) {
        int[] burstTime = {6, 2, 4, 1};
        int n = burstTime.length;
        Arrays.sort(burstTime);
        int waitingTime = 0;
        int totalWaitingTime = 0;
        for (int i = 0; i < n; i++) {
            totalWaitingTime += waitingTime;
            waitingTime += burstTime[i];
        }
        double avgWaitingTime = (double) totalWaitingTime / n;
        System.out.println("Average Waiting Time = " + avgWaitingTime);
    }
}