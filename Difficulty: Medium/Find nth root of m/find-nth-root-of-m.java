class Solution {
    public int nthRoot(int n, int m) {
       int s=0;
       int e=m;
       while(s<=e){
           int mid = (s+e)/2;
           int val = 1;
           for(int i=1;i<=n;i++){
               val*=mid;
           }
           if(m==val){
               return mid;
           } else if(val>m){
               e=mid-1;
           } else {
               s=mid+1;
           }
       }
       return -1;
    }
}