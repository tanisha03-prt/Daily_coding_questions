package graph_theory;
import java.util.*;
public class dfs_traversal {
    public List<Integer> dfs(int V, ArrayList<ArrayList<Integer>> adj){
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfs(0,adj,visited,ans);
        return ans;
    }
    private void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, List<Integer> ans){
        visited[node] = true;
        ans.add(node);
        for(int neighbour : adj.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour,adj,visited,ans);
            }
        }
    }
}
