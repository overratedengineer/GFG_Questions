// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
         int ans =n;
         while(n % 2 == 0){
            n = n / 2;
            ans=2;
        }

        // check odd numbers from 3 to sqrt(n)
        for(int i = 3; i * i <= n; i = i + 2){
            while(n % i == 0){
                ans =i;
                n = n / i;
            }
        }

        // if n becomes prime and > 2
        if(n > 2){
            ans=n;
            
        }
        return ans;
        
    }
}