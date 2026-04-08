class Solution {
    public int solve(int i,int w,int val[],int wt[],Integer dp[][]){
        if(i>val.length-1){
            return 0;
        }
        if(dp[i][w]!=null) return dp[i][w];
        //not pick
      int a=  solve(i+1,w,val,wt,dp);
        //pick
        int b =0;
        if(w-wt[i]>=0){
       b= solve(i+1,w-wt[i],val,wt,dp)+val[i];
        }
        return dp[i][w]=Math.max(a,b);
    }
    public int knapsack(int W, int val[], int wt[]) {
        Integer dp[][] = new Integer[val.length][W+1];
       return solve(0,W,val,wt,dp);
    }
}
