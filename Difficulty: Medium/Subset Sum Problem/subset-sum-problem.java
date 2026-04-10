class Solution {
     
    static boolean solve(int i,int arr[],int sum,Boolean dp[][]){
        int n = arr.length;
       if(sum==0){
           return true;
       }
       
     
       if(i==n) return false;
       // not take
       if(dp[i][sum]!=null) return dp[i][sum];
       
      boolean  a= solve(i+1,arr,sum,dp);
       
       //take
       if(sum-arr[i]>=0){
        a = a ||  solve(i+1,arr,sum-arr[i],dp);
       }
       return dp[i][sum]=a;
    }
    static Boolean isSubsetSum(int arr[], int sum) {
         int n = arr.length;
        Boolean dp[][] = new Boolean[n][sum+1];
       return solve(0,arr,sum,dp);
        
    }
}