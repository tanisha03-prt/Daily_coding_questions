package graph_theory;
import java.util.*;
public class topological_sort{
    static ArrayList<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                dfs(i, adj, visited, st);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()) {
            ans.add(st.pop());
        }
        return ans;
    }
    static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> st) {
        visited[node] = true;
        for(int neighbour : adj.get(node)) {
            if(!visited[neighbour]) {
                dfs(neighbour, adj, visited, st);
            }
        }
        st.push(node);
    }
}
