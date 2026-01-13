class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for( int x : arr){
            hs.add(x);
        }
        int max =1;
       for(int x:arr){
           if(!hs.contains(x-1)){
               int i = x;
               while(hs.contains(i)){
                   max=Math.max(max,i-x+1);
                    i++;
               }
           }
       }
       return max;
    }
}