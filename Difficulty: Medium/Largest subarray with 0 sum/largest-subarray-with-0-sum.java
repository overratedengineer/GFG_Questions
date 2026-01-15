class Solution {
    int maxLength(int arr[]) {
        int sum = 0;
        int j = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        for (int val : arr) {
            sum += val;
            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                max = Math.max(max, j - prevIndex);
            } else {
                map.put(sum, j);
            }
            j++;
        }
        return max;
    }
}
