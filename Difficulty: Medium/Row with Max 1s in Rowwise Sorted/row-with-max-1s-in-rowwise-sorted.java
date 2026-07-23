class Solution {
    public int rowWithMax1s(int[][] arr) {
        int n = arr.length;
        int max = 0;
        int in =-1;
         for(int i=0;i<n;i++){
        int m= arr[i].length;
        int s=0;
        int e = m-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[i][mid]>=1){
                e=mid-1;
            } else {
                s=mid+1;
            }
        }
        if(m-s>max){
            max = m-s;
            in=i;
        }
         }
        return (max==0) ? -1 : in;
    }
};