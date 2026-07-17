class Solution {
    public long subarrayXor(int arr[], int k) {
      int n = arr.length;
     HashMap<Integer,Integer> map = new HashMap<>();
     int x =0;
     map.put(0,1);
     int ans =0;
     for(int i=0;i<n;i++){
         x^=arr[i];
         int needed = x^k;
         int kl =1;
         if(map.containsKey(needed)){
             kl=map.get(needed);
             ans+=kl;
         }
        map.put(x, map.getOrDefault(x, 0) + 1);
     }
        return ans;
    }
}