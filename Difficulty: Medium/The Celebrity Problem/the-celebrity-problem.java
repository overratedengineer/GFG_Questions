class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;

        int i=0, j=n-1;
        while (i<j) {
            if (mat[i][j] == 1) {
                i++;
            } else{
                j--;
            } 
        }
        int candidate = i;
        for (int k = 0; k < n; k++) {
            if (k != candidate) {
                if (mat[candidate][k] == 1 || mat[k][candidate] == 0) {
                    return -1;
                }
            }
        }

        return candidate;
    }
}