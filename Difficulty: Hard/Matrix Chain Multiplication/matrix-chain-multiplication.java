class Solution {
    static int matrixMultiplication(int arr[]) {
        Integer dp[][] = new Integer[arr.length][arr.length];
      return solve(1,arr.length-1,arr,dp);
        
    }
    static int solve(int i,int j ,int arr[], Integer dp[][]){
        if(i==j) return 0;
        if(dp[i][j]!=null) return dp[i][j];
         int min = Integer.MAX_VALUE;
         
        for(int k=i;k<j;k++){
            int steps = arr[i-1]*arr[k]*arr[j]+solve(i,k,arr,dp)+solve(k+1,j,arr,dp);
            min=Math.min(steps,min);
        }
        return dp[i][j]=min;
    }
}