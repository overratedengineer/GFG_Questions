

class Solution {
    public int rowWithMax1s(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
         int s =0;
         int e =m-1;
         int ans =-1;
         while(s<=e){
             int mid = s+(e-s)/2;
             for(int i =0;i<n;i++){
                 if(arr[i][mid]==1) { e=mid-1; ans =i;break;} 
             }
             if(e!=mid-1){s=mid+1;}
         }
         return ans;
    }
}