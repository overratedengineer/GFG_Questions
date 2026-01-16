class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        int sum = 0;
        int max = 0;
        int s = 0;
        int e = -1;
        int tempStart = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 ) {
                sum+=arr[i];
                if (sum>max || (sum==max && i-tempStart > e-s)) {
                    max=sum;
                    s=tempStart;
                    e=i;
                }
            } else {
                sum =0;
                tempStart =i+1;
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        if (e==-1) {
            al.add(-1);
            return al;
        }

        for (int i=s; i<=e; i++) {
            al.add(arr[i]);
        }

        return al;
    }
}
