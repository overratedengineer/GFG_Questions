class Solution {
    public void sortInWave(int arr[]) {
        int n = arr.length;
       for(int i=1;i<n;i+=2){
           int temp = arr[i];
           arr[i]=arr[i-1];
           arr[i-1]=temp;
       }
    }
}
