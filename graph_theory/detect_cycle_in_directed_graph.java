package graph_theory;
import java.util.*;
public class detect_cycle_in_directed_graph {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[V];
        boolean[] pathVis = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,adj,visited,pathVis)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] visited,boolean[] pathVis){
        visited[node] = true;
        pathVis[node] = true;
        for(int neighbour : adj.get(node)){
            if(!visited[neighbour]){
                if(dfs(neighbour,adj,visited,pathVis)){
                    return true;
                }else if(pathVis[neighbour]){
                    return true;
                }
            }
        }
        pathVis[node] = false;
        return false;
    }
}
