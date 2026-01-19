class Solution {
    public void printTable(int n) {
        int m = 10;
        while (m > 0) {
           System.out.print(m*n+" ");
           m--;
        }
        System.out.println();
    }
}