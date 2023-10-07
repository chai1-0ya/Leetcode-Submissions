class Solution {
    
    public void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i=0,j=1;
        while(i<=j && j<n){
            if(arr[i]==arr[j]){
                j++;
                continue;
            }
            swap(arr,i+1,j);
            i++;
            j++;
        }
        return i+1;
    }
}