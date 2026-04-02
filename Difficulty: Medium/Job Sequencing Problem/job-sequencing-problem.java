/*
struct Job
{
   int id;	 // Job Id
   int deadline; // Deadline of job
   int profit; // Profit if job is over before or on deadline
};
*/
class Solution {
    // Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n) {
     Arrays.sort(arr,(a,b)->a.deadline-b.deadline);
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->a-b);
        // int sum=0;
        // int d = 0;
        for(int i=0;i<n;i++){
            int d = arr[i].deadline;
            int a = arr[i].profit;
              q.add(a);
              if(q.size()>d){
                  q.remove();
              }
        }
        int s = q.size();
        int sum=0;
        while(!q.isEmpty()){
            sum+=q.remove();
        }
        return new int[]{s,sum};
    }
}