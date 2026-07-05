package graph_theory;
import java.util.*;
public class cycle_detection_using_kahn {
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj, int V){
        int[] indegree = new int[V];
        for(int i=0;i<V;i++){
           for(int neighbour : adj.get(i)){
            indegree[neighbour]++;
        }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        int count = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            for(int neighbour : adj.get(node)){
                indegree[neighbour]--;
                if(indegree[neighbour] == 0){
                    q.offer(neighbour);
                }
            }
        }
        return count != V;
    }
}
