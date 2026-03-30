class Solution {
    static String isKSortedArray(int arr[], int n, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        for(int i=0;i<n;i++){
            pq.offer(new int []{arr[i],i});
        }
        for(int i=0;i<n;i++){
            int curr[]=pq.poll();
            if(Math.abs(i-curr[1])>k)return "No";
        }
        return "Yes";
    }
}