class Solution {
    public int kthElement(int a[], int b[], int k) {
        int n1 = a.length;
        int n2 = b.length;
        if(n1>n2) return kthElement(b,a,k);
        int n = n1+n2;
         int s = Math.max(0, k - n2);
        int e = Math.min(n1, k);
        int left = k;
        while(s<=e){
            int mid = (s+e)/2;
            int mid2 = left-mid;
        int l1 =  Integer.MIN_VALUE;
        int l2 = Integer.MIN_VALUE;
        int r1 = Integer.MAX_VALUE;
        int r2 = Integer.MAX_VALUE;
           if (mid > 0) l1 = a[mid - 1];
            if (mid2 > 0) l2 = b[mid2 - 1];
            if (mid < n1) r1 = a[mid];
            if (mid2 < n2) r2 = b[mid2];
            if(l1<=r2 && l2<=r1){
          return Math.max(l1,l2);
          
        } else if( l1>r2){
          e =mid-1;
        } else {
          s=mid+1;
        }
     }
      return 0;
        }
}