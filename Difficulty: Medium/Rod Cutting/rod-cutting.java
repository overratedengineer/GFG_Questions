class Solution {
    public int cutRod(int[] price) {
         int n =price.length;
        Integer dp[][] = new Integer[n][n+1];
        return solve(n,0,price,dp);
    }
    public int solve(int n,int i,int price[],Integer dp[][]){
       if(i==price.length){
           return 0;
       }
       if(n==0) return 0;
       if(dp[i][n]!=null) return dp[i][n];
      dp[i][n]=solve(n,i+1,price,dp);
       // take
       if(n-i-1>=0)
       dp[i][n]=Math.max(dp[i][n],solve(n-(i+1),i,price,dp)+price[i]);
       return dp[i][n];
    }
}