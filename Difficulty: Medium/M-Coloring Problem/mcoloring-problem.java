import java.util.*;
class Solution {
   boolean graphColoring(int v, int[][] edges, int m) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i=0;i<v;i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] e:edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        int[] color=new int[v];
        return solve(0,adj,color,m,v);
    }
    boolean solve(int node,List<List<Integer>> adj,int[] color,int m,int v){
        if (node==v) return true;
        for (int c=1;c<=m;c++) {
            if (isSafe(node,adj,color,c)) {
                color[node]=c;
                if (solve(node+1,adj,color,m,v)) return true;
                color[node]=0;
            }
        }
        return false;
    }
    boolean isSafe(int node,List<List<Integer>> adj,int[] color,int c){
        for (int nei:adj.get(node)) {
            if (color[nei]==c) return false;
        }
        return true;
    }
}