class Solution {
    public int kthElement(int nums1[], int nums2[], int k) {
         // kth index 
          int n = nums1.length;
          int m = nums2.length;
          if(n>m) kthElement(nums2,nums1,k);
          int s = Math.max(0,k-m);
          int e = Math.min(n,k);
          while(s<=e){
              int mid = s+(e-s)/2;
              int need = k-mid;
              int l1 = (mid>0)?nums1[mid-1]:Integer.MIN_VALUE;
              int r1 = (mid<n)?nums1[mid]:Integer.MAX_VALUE;
              int l2 = (need>0)?nums2[need-1]:Integer.MIN_VALUE;
              int r2 = (need<m)?nums2[need]:Integer.MAX_VALUE;
              if(l1<=r2 && r1>=l2){
                  return Math.max(l2,l1);
              } else if(l1>r2){
                  e=mid-1;
              } else {
                  s=mid+1;
              }
              
          }
          return 0;
    }
}
   // 2 3 6 - 7 9
   // 1 4   - 8 10 
  