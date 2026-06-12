class Solution {
    void dfs(int node,
             ArrayList<ArrayList<ArrayList<Integer>>> adj,
             boolean[] vis,
             Stack<Integer> st) {
           vis[node] = true;
        for (ArrayList<Integer> edge : adj.get(node)) {
            int v = edge.get(0);
            if (!vis[v]) {
                dfs(v, adj, vis, st);
            }
        }
        st.push(node);
    }
    Stack<Integer> topoSort(int V,
                            ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        boolean[] vis = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, adj, vis, st);
            }
        }
        return st;
    }
    public int[] shortestPath(int V, int E, int[][] edges) {
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(v);
            temp.add(w);
            adj.get(u).add(temp);
        }
        Stack<Integer> st = topoSort(V, adj);
        int[] dist = new int[V];
        Arrays.fill(dist, (int) 1e9);
        dist[0] = 0;
        while (!st.isEmpty()) {
            int u = st.pop();
            if (dist[u] == (int) 1e9) {
                continue;
            }
            for (ArrayList<Integer> edge : adj.get(u)) {
                int v = edge.get(0);
                int w = edge.get(1);
                if (dist[v] > dist[u] + w) {
                    dist[v] = dist[u] + w;
                }
            }
        }
        for (int i = 0; i < V; i++) {
            if (dist[i] == (int) 1e9) {
                dist[i] = -1;
            }
        }
        return dist;
    }
}