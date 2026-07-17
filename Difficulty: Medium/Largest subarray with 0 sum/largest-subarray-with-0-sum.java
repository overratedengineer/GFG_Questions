class Solution {
    int maxLength(int arr[]) {
        int n = arr.length;
        int target =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int p =0;
        int l =0;
    
        for(int i=0;i<n;i++){
             p+=arr[i];
             if(p==target) l =i+1;
            int needed = p-target;
            if(map.containsKey(needed)){
                int idx = map.get(needed);
                l = Math.max(i-idx,l);
            }
            if(!map.containsKey(p)){
                map.put(p,i);
            }
        }
        return l;
        
    }
}