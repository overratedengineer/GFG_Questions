class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a,b) -> Double.compare(b[0], a[0]));
        int n = val.length;
        for(int i = 0; i < n; i++){
            double f = (double) val[i] / wt[i];
            pq.add(new double[]{f, wt[i]});
        }
        double c = 0;
        while(!pq.isEmpty()){
            double d[] = pq.remove();
            
            if(d[1] > capacity){
                c += d[0] * capacity;
                break;
            } 
            c += d[0] * d[1];
            capacity -= d[1];
        }
        
        return c;
    }
}