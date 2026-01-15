class Solution {
    public long subarrayXor(int arr[], int k) {
      HashMap<Integer,Integer> map = new HashMap<>();
      //I must say solve the question, it is easy after 1 calculation
      map.put(0,1);
      int n = arr.length;
      int xor = 0;
      int count =0;
      for(int i=0;i<n;i++){
          xor^=arr[i];
          int needed = k^xor;
          if(map.containsKey(needed)){
              int val = map.get(needed);
              count+=val;
          }
          if(map.containsKey(xor)){
              int v = map.get(xor);
              map.put(xor,v+1);
          } else {
             map.put(xor,1);  
          }
          
      }
      return count;
        
    }
}