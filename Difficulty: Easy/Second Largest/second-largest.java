class Solution {
    public int getSecondLargest(int[] arr) {
        int max=-1;
        int max2=-1;
         for(int i:arr){
             if(i>max){
                 max2=max;
                 max=i;
             }
             if(i!=max&& i>max2){
                 max2=i;
             }
         }
       return max2;
    }
}