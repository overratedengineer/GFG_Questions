class Solution {

    static long inversionCount(int arr[]) {
        long[] count = new long[1];
        mergeSort(arr,0,arr.length-1,count);
        return count[0];
    }

    static void mergeSort(int arr[],int s,int e,long[] count) {
        if (s>=e) return;

        int mid = s+(e-s)/2;
        mergeSort(arr,s, mid,count);
        mergeSort(arr, mid+1,e,count);
        merge(arr,s,mid,e,count);
    }

    static void merge(int arr[],int s,int mid,int e,long[] count) {
        int[] temp = new int[e-s+1];
        int i=s, j=mid+1, k=0;

        while (i<=mid && j<=e) {
            if (arr[i]<=arr[j]) {
                temp[k++]=arr[i++];
            } else {
                temp[k++]=arr[j++];
                count[0]+=(mid-i+1); 
            }
        }

        while (i<=mid) temp[k++]=arr[i++];
        while (j<=e) temp[k++]=arr[j++];

        for (int x=0;x<temp.length;x++) {
            arr[s+x]=temp[x];
        }
    }
}
