class Solution {
    public int kthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]<pq.peek()){
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.remove();
    }
}