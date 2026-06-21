import java.util.*;
package graph_theory;

public class bfs_traversal {
    public List<Integer> bfs(int v, ArrayList<ArrayList<Integer>> adj){
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);
            for(int neighbour : adj.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
        return ans;
    }
}
