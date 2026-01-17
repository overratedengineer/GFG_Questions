class Solution {
    int upperBound(int[] arr, int target) {
       int s =0;
      int e = arr.length-1;
      int ans = arr.length;
      while(s<=e){
          int mid = (s+e)/2;
         if(arr[mid]==target){
             s=mid+1;
             } else if(arr[mid]>target){
              ans=mid;
              e=mid-1;
          } else{
              s=mid+1;
          }
      }
      return ans;
        
    }
}
