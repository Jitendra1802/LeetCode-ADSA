class Solution {
    public int firstMissingPositive(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]>0 && arr[i]<=n && arr[i]!=arr[arr[i]-1]){
                swap(arr, i, arr[i]-1);
            }else{
                i++;
            }

        }
        for(i=0;i<n;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
    public void swap(int[] arr, int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}