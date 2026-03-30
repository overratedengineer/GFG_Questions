class Solution {
    public String minWindow(String s1, String s2) {
        if (s1.length() < s2.length()) return "";
        int n = s1.length();
        int m = s2.length();
        int i = 0;
        int minLen = Integer.MAX_VALUE;
        String ans = "";
        while (i<n) {
            int j=0;
            while (i<n&&j<m) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    j++;
                }
                i++;
            }
            if (j<m) break;
            int e=i-1;
            i=e;
            j=m-1;
            while (i>=0&&j>=0) {
                if (s1.charAt(i)==s2.charAt(j)) {
                    j--;
                }
                i--;
            }
            int s=i+1;
            if (e-s+1<minLen) {
                minLen=e-s+1;
                ans=s1.substring(s,e+1);
            }
            i=s+1;
        }
        return ans;
    }
}