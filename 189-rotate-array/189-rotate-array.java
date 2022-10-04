class Solution {
    
    public int[] rotate(int[] arr, int m, int n){
        while(m<n){
            int t = arr[m];
            arr[m] = arr[n];
            arr[n] = t;
            m++;
            n--;
        }
        return arr;
    }
    
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        nums = rotate(nums,n-k,n-1);
        nums = rotate(nums,0,n-k-1);
        nums = rotate(nums,0,n-1);
    }
}