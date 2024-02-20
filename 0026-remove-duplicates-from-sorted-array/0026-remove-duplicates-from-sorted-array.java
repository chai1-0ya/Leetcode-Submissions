class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0, j = 1;
        while(j<n){
            if(nums[i]!=nums[j]){
                swap(nums, i+1, j);
                i++;
                j++;
            }
            else if(nums[i]==nums[j])
                j++;
        }
        return i+1;
    }
    
    public void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}