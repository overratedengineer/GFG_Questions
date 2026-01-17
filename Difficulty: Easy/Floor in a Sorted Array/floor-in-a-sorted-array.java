class Solution {
    public int findFloor(int[] nums, int target) {
       int s =0;
      int e = nums.length-1;
      int ans = -1;
        while(s<=e){
          int mid = (s+e)/2;
          if(nums[mid]==target){
             s=mid+1;
            ans=mid;
          }
        else if(nums[mid]>target){
              e=mid-1;
          } else{
              ans=mid;
              s=mid+1;
          }
      }
     
           return ans;
      
    }
}
