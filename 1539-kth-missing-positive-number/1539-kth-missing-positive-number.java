class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0;
        int h = arr.length;
        while(l<h){
            int mid = l+(h-l)/2;
            if(arr[mid]-mid > k)
                h = mid;
            else 
                l = mid+1;
        }
        return l+k;
    }
}