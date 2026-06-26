class Solution {
    int floorSqrt(int n) {
        if(n==1) return 1;
        if(n==0) return 0;
       int s =2;
       int e = (n/2)+1;
       while(s<=e){
           int mid = s+(e-s)/2;
           if(mid*mid==n) return mid;
           if(mid*mid<n) s=mid+1;
           else e=mid-1;
       }
        return e;
    }
}