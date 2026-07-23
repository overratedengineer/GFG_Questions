class Solution {
    
    public double minMaxDist(int[] arr, int k) {
     //  Arrays.sort(arr);
       int n = arr.length;
       int hows[] = new int[n];
       Arrays.fill(hows,1);
       PriorityQueue<Pair> pq = new PriorityQueue<>( (p1, p2)->Double.compare(p2.dis, p1.dis));
       for(int i=1;i<n;i++){
           pq.add(new Pair(i,i-1,1,arr));
       }
    
    while(!pq.isEmpty() && k>0){
        Pair ex = pq.remove();
        int a = ex.a;
        int b = ex.b;
        int bg = ex.bg+1;
        double dis = ex.dis;
        k--;
        hows[a]++;
        pq.add(new Pair(a,b,bg,arr));
    }
    double max =0;
    for(int i=1;i<n;i++){
        double val = ((double)arr[i]-arr[i-1])/(double)hows[i];
        max = Math.max(max,val);
        
    }
    return max;
    }
}
    
class Pair {
    int a;
    int b;
    int bg;
    double dis =0;
    Pair(int a,int b,int bg ,int arr[]){
        this.a=a;
        this.b=b;
        this.bg=bg;
        this.dis = (double)(arr[a]-arr[b])/bg;
    }
}
