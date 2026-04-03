class Solution {
    static int solve(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int sum = 0;
        int curr = 0;
        for(int i = 0; i < n; i++){
            sum+=curr;
            curr+= arr[i];
        }
        return sum/n;
    }
}