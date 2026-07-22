class Solution {
    public int aggressiveCows(int[] arr, int k) {
       int n = arr.length;
       Arrays.sort(arr);
       int s = 0;
       int e =arr[n-1]-arr[0];
       int ans =0;
       while(s<=e){
           int mid = s+(e-s)/2;
           int kn =1;
           int prev = arr[0];
           for(int i=1;i<n;i++){
               int diff=arr[i]-prev;
               if(diff>=mid){
                   kn++;
                   prev=arr[i];
               }
           }
            if(kn>=k){
                ans=mid;
                s=mid+1;
            } else {
                e=mid-1;
            }
       }
       return ans;
    }
}