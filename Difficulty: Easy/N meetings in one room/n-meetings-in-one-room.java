
class Solution {
    
    public int maxMeetings(int start[], int end[]) {
       PriorityQueue<int []> pq = new PriorityQueue<>(
           (a,b) -> a[1]-b[1]);
            for (int i = 0; i < start.length; i++) {
            pq.add(new int[]{start[i], end[i]}); 
        }
           int comp = -1;
           int count=0;
       while (!pq.isEmpty()) {
            int[] x = pq.poll();   
            if (x[0] > comp) {     
                count++;
                comp = x[1];
            }
        }

        return count;
    }
}
