class Solution {
    int minCost(int[] heights) {
        int n = heights.length;
        int dp[] = new int[n];
         dp[0]=0;
        for(int i =1;i<n;i++){
            int val1 = Math.abs(heights[i]-heights[i-1])+dp[i-1];
               int val2 = val1;
            if(i>1) val2 = Math.abs(heights[i]- heights[i-2])+dp[i-2];
             dp[i] = Math.min(val1,val2);
        }
        return dp[n-1];
    }
}