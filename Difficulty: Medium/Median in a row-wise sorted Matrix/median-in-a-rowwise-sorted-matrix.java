class Solution {
    public int min(int[][] arr,int mi){
       int n = arr.length;
        int m = arr[0].length;
        int count =0;
        for(int i=0;i<n;i++){
            int s =0;
            int e =m-1;
            while(s<=e){
                 int mid = s+(e-s)/2;
                 if(mi>=arr[i][mid]){
                     s=mid+1;
                 } else {
                     e=mid-1;
                 }
            }
            count+=s;
        }
        return count;
    }
    public int median(int[][] arr) {
    // first try to compute mid and check if its greater than half of the elements 
        int n = arr.length;
        int m = arr[0].length;
        int max =0;
        int min = 2001;
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i][0]);
            max=Math.max(max,arr[i][m-1]);
        }
        int s =min;
        int e =max;
        int val = (n*m)/2;
        while(s<=e){
            int mid = s+(e-s)/2;
            int count = min(arr,mid);
            if(count>val){
                e=mid-1;
            } else {
                s=mid+1;
            }
        }
        return s;
    }
}