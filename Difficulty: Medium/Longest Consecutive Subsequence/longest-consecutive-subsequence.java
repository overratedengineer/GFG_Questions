class Solution {
    public int longestConsecutive(int[] arr) {
       int n = arr.length;
       HashSet<Integer> set = new HashSet<>();
       for(int i:arr){
           set.add(i);
       }
       int max =0;
       for(int i:arr){
           int v=i;
           if(set.contains(v) && !set.contains(v-1)){
               int count=1;
               while(set.contains(v+1)){
                   v++;
                   count++;
               }
               max = Math.max(count,max);
           }
       }
        return max;
    }
}