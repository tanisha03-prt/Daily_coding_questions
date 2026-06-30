package graph_theory;
import java.util.*;
public class kanh_algorithm {
    static ArrayList<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj){
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
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);
            for(int neighbour : adj.get(node)){
                indegree[neighbour]--;
                if(indegree[neighbour] == 0){
                    q.offer(neighbour);
                }
            }
        }
        return ans;
    }
}
