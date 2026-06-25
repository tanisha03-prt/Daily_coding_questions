package graph_theory;
import java.util.*;
public class detect_cycle_undirected_bfs {

    class Pair {
        int node;
        int parent;
        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }
    public boolean isCycle(int V,
                           ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                if(bfs(i, adj, visited))
                    return true;
            }
        }
        return false;
    }
    private boolean bfs(int start,
                        ArrayList<ArrayList<Integer>> adj,
                        boolean[] visited) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(start, -1));
        visited[start] = true;
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int node = curr.node;
            int parent = curr.parent;
            for(int neighbour : adj.get(node)) {
                if(!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.offer(new Pair(neighbour, node));
                }
                else if(neighbour != parent) {
                    return true;
                }
            }
        }
        return false;
    }
}
