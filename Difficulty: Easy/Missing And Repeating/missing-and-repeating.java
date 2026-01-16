class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        long sum=0;
        long sq_sum=0;
        for(int val :arr ){
            sum+=val;
           sq_sum += (long) val * val;

            
        }
        
       long ex_sum = (long)n*(n+1)/2;
        // calculate diff of these, that will be ex_sum-sum
        long diff_sum=(long)ex_sum-sum;
        // calculate square sum diff
        long exp_sq_sum = (long)n*(n+1)*(2L*n+1)/6;
        //calculate diff of these , that will be exp_sq_sum-sq_sum
        long diff_sq_sum = (long)exp_sq_sum-sq_sum;
        //now consider that X-Y will be the diff of those two numbers that we got
        //from ex_sum-sum and (X^2-Y^2) from exp_sq_sum-sq_sum , now we got 2 equations solve them
        // open (X-Y)(X+Y)= (X^2-Y^2) 
        // we calculated (X^2-Y^2) divide it by x-y we already calculated we will be left with x+y
        // we now have x+y and x-y add them up we'll be left with 2x calculate and then find y
        
        long sum_x_y = diff_sq_sum/diff_sum;
        long x = (sum_x_y+diff_sum) /2;
        long y = sum_x_y-x;
        ArrayList<Integer> al = new ArrayList<>();
        al.add((int)y);
        al.add((int)x);
        return al;
    }
}
