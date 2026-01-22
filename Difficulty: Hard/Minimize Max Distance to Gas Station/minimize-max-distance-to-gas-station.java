import java.util.*;

class Solution {
    public double minMaxDist(int[] arr, int k) {
        int n = arr.length;
        if (n <= 1) return 0.0;
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (x, y) -> Double.compare(y[0], x[0])
        );

        int[] a = new int[n - 1];
       // Arrays.fill(a, 0);

        for (int i = 0; i < n-1; i++) {
            pq.add(new double[]{arr[i+1] - arr[i], i});
        }

        for (int i = 0; i < k; i++) {
            double[] p = pq.poll();
            int idx = (int) p[1];
            a[idx]++;
            double correctedpos = (arr[idx + 1] - arr[idx]);
            double div = correctedpos / (a[idx] + 1);

            pq.add(new double[]{div, idx});
        }

        return pq.peek()[0];
    }
}
