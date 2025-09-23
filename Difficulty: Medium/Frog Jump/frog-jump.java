import java.util.*;
class Solution {
      int[] dp;

    int minCost(int[] height) {
        dp = new int[height.length];
        Arrays.fill(dp, -1);
        return solve(0, height);
    }
    
    int solve(int i, int[] h ) {
        if(dp[i]!=-1){
            return dp[i];
        }
        if (i == h.length - 1) return 0; 
        int cost1 = Math.abs(h[i] - h[i + 1]) + solve(i + 1, h);
        int cost2 = Integer.MAX_VALUE;
        if (i + 2 < h.length) {
            cost2 = Math.abs(h[i] - h[i + 2]) + solve(i + 2, h);
        }
        dp[i] = Math.min(cost1, cost2);
        return Math.min(cost1, cost2);
    }

  
}
