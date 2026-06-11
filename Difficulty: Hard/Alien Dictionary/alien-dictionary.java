import java.util.*;

class Solution {

    ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        int v = adj.size();
        Queue<Integer> q = new LinkedList<>();
        int fl[] = new int[v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                int e = adj.get(i).get(j);
                fl[e]++;
            }
        }
        for (int i = 0; i < v; i++) {
            if (fl[i] == 0) {
                q.add(i);
            }
        }
        ArrayList<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()) {
            int curr = q.remove();
            topo.add(curr);
            for (int i = 0; i < adj.get(curr).size(); i++) {
                int e = adj.get(curr).get(i);
                fl[e]--;
                if (fl[e] == 0) {
                    q.add(e);
                }
            }
        }
        return topo;
    }

    public String findOrder(String[] words) {
        int n = words.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 26; i++) { 
            adj.add(new ArrayList<>());
        }
        boolean present[] = new boolean[26];
        for (String s : words) {
            for (char ch : s.toCharArray()) {
                present[ch - 'a'] = true;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];
            int x = s1.length();
            int y = s2.length(); 
            int min = Math.min(x, y);
            int flag = 0;
            for (int j = 0; j < min; j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    flag = 1;
                    adj.get(s1.charAt(j) - 'a')
                       .add(s2.charAt(j) - 'a');
                    break;
                }
            }
            if (flag==0&&x>y) { 
                return "";
            }
        }
        ArrayList<Integer> topo = topologicalSort(adj);
        StringBuilder sb = new StringBuilder();
        int tc=0;
        int pc=0;
        
            for(int i = 0; i < 26; i++) {
               if(present[i]) {
                tc++;
               }
              }
        for (int node : topo) {
            if (present[node]) {
                pc++;
                sb.append((char) (node + 'a'));
            }
        }
        if(pc<tc) {
         return "";
}
        return sb.toString();
    }
}