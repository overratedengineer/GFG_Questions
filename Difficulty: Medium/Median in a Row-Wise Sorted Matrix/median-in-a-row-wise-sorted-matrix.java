class Solution {
    public int lv(int[][] arr,int t){
        int n = arr.length;
        int m = arr[0].length;
        int rv =0;
        for(int i=0;i<n;i++){
            int s =0;
            int e = m-1;
            int ans=-1;
            while(s<=e){
                int mid = s+(e-s)/2;
                if(arr[i][mid]>t){
                    e=mid-1;
                } else {
                    ans=mid;
                    s=mid+1;
                }
            }
            rv+=ans+1;
        }
        return rv;
    }
    public int median(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int min =Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(arr[i][0],min);
        }
        for(int i=0;i<n;i++){
            max = Math.max(arr[i][m-1],max);
        }
        int needed = (n*m)/2;
        int s = min;
        int e = max;
        while(s<=e){
            int mid = s+(e-s)/2;
            int val = lv(arr,mid);
            if(val<=needed){
                s=mid+1;
            } else {
                e=mid-1;
            }
        }
        return s;
        
        
    }
}