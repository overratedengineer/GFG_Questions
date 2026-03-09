class Solution {
    public static int[] count_NGE(int arr[], int indices[]) {

        int N = arr.length;
        int queries = indices.length;
        int ans[] = new int[queries];

        for(int i = 0; i < queries; i++) {
            int idx = indices[i];
            int count = 0;

            for(int j = idx + 1; j < N; j++) {
                if(arr[j] > arr[idx]) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}