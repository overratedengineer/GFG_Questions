class Solution {

    static int getXor(int nums[], int a, int b) {
        int n = nums.length;
        int px[] = new int[n];
        px[0] = nums[0];

        for(int i=1;i<n;i++){
            px[i] = px[i-1] ^ nums[i];
        }
        if(a == 0){
            return px[b];
        }
        return px[b] ^ px[a-1];
    }
}