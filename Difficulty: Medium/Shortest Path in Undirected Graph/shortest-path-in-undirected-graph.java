class Solution {
    public int[] shortestPath(int V, int[][] edges, int src) {
        int n = edges.length;
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i=0;i<V;i++){
            al.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
                int u = edges[i][0];
                int v = edges[i][1];
                al.get(u).add(v);
                al.get(v).add(u);
        }
            
       int dis[] = new int[V];
       Arrays.fill(dis,(int)1e9);
       Queue<int[]> q= new LinkedList<>();
       dis[src]=0;
       q.add(new int[]{src,0});
       while(!q.isEmpty()){
           int arr[] = q.remove();
           int u = arr[0];
           int w = arr[1];
           for(int i =0;i<al.get(u).size();i++){
               int v = al.get(u).get(i);
               if(dis[v]>w+1){
                   dis[v]= dis[u]+1;
                   q.add(new int [] {v,dis[v]});
               }
           }
       }
       for(int i=0;i<V;i++){
           if(dis[i]==(int)1e9){
               dis[i]=-1;
           }
       }
        return dis;
    }
}
