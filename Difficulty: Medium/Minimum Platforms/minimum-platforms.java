class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int n = arr.length;

        int i = 0;
        int j = 0;
        int p =0;
        int max = 0;

        while (i<n &&j<n) {

            if (arr[i] <= dep[j]) {
               p++;
                i = i + 1;
            } else {
              p--;
                j = j + 1;
            }

            if (p > max) {
                max = p;
            }
        }

        return max;
    }
}
