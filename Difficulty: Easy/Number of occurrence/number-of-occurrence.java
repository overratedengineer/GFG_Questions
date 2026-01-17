class Solution {
    int countFreq(int[] nums, int target) {
        int n = nums.length;
        int ans[] = {-1, -1};
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (nums[mid] == target) {
                ans[0] = mid;
                e = mid-1; 
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        if (ans[0] == -1) return 0;
        s = 0;
        e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (nums[mid] == target) {
                ans[1] = mid;
                s = mid + 1;   
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans[1]-ans[0]+1;
    }
}
