class Solution {
    public int kthElement(int nums1[], int nums2[], int k) {
       if(nums1.length > nums2.length)
            return kthElement(nums2, nums1,k);
        int n1 = nums1.length;
        int n2 = nums2.length;
       int s = Math.max(0, k - n2);
       int e = Math.min(k, n1);
        while(s<=e){
            int cut1 = s+(e-s)/2;
            int cut2 = k-cut1;
            int l1 = (cut1==0) ? Integer.MIN_VALUE : nums1[cut1-1];
            int l2 = (cut2==0) ? Integer.MIN_VALUE : nums2[cut2-1];
            int r1 = (cut1==n1) ? Integer.MAX_VALUE : nums1[cut1];
            int r2 = (cut2==n2) ? Integer.MAX_VALUE : nums2[cut2];
            if(l1<=r2&&l2<=r1){
                return Math.max(l1,l2);
            }
            if(l1>r2){
                e=cut1-1;
            }else{
                s=cut1+1;
            }
        }

        return 0;
        
    }
}