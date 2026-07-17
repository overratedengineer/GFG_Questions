class Solution {
     void mergei(int arr[],int s,int e,int count[]){
        if(s>=e) return ;
       int mid = (e+s)/2;
       mergei(arr,s,mid, count);
       mergei(arr,mid+1,e, count);
       merge(arr,s,mid,e,count);
    }
    public void merge(int arr[],int s,int mid, int e,int count[]){
        int arr1[] = new int[e-s+1];
        int i=s;
        int j=mid+1;
        int k =0;
        while(i<mid+1 && j<=e){
            if(arr[i]>arr[j]){
                arr1[k++]=arr[j++];
                count[0]+=mid-i+1;
            } else {
                arr1[k++]=arr[i++];
            }
        }
        while(i<mid+1){
            arr1[k++]=arr[i++];
        }
        while(j<=e){
            arr1[k++]=arr[j++];
        }
        for (int x=0;x<arr1.length;x++) {
            arr[s+x]=arr1[x];
        }
    }
    public int inversionCount(int arr[]) {
           int count[] = new int[1];
           mergei(arr, 0, arr.length - 1, count);
        return count[0];
        
    }
}