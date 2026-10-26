import java.util.*;

class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }

        boolean[] visited = new boolean[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int[] stats = new int[2]; 
                dfs(i, adj, visited, stats);
                if (stats[1] == stats[0] * (stats[0] - 1)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private void dfs(int node, List<Integer>[] adj, boolean[] visited, int[] stats) {
        visited[node] = true;
        stats[0]++;            
        stats[1] += adj[node].size(); 
        
        for (int next : adj[node]) {
            if (!visited[next]) {
                dfs(next, adj, visited, stats);
            }
        }
    }
}
