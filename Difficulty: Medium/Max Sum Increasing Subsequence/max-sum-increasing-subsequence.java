class Solution {
    public int maxSumIS(int arr[]) {
     int n = arr.length;
        Integer dp[][] = new Integer[n][n+1];
         return solve(0,-1,arr,dp);
        
    }
     public int solve(int i,int p,int[] nums,Integer dp[][]){
        if(i==nums.length){
            return 0;
        }
        if(dp[i][p+1]!=null){
            return dp[i][p+1]; 
        }
         int a = solve(i+1,p,nums,dp);
         int b =0;
         if(p==-1 || nums[i]>nums[p]){
           b =solve(i+1,i,nums,dp)+nums[i];
         }
     dp[i][p+1]=Math.max(a,b);
     return dp[i][p+1];
    }
}