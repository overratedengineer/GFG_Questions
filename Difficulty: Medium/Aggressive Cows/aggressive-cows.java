class Solution {
    public int aggressiveCows(int[] arr, int k) {
     Arrays.sort(arr);
     int n = arr.length;
    
     int s =1;
     int e = arr[n-1]-arr[0];
     int ans =0;
     while(s<=e){
         int mid = s+(e-s)/2;
         int diff = arr[0];
         int cows=1;
         for(int i=1;i<n;i++){
             if(arr[i]-diff>=mid){
                 cows++;
                 diff=arr[i];
             }
         }
            if(cows>=k){
                 ans =mid;
                s=mid+1;
               
            } else{
                e=mid-1;
               
            } 
     }
     return ans;
    }
}