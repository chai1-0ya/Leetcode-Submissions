class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0, j=1;
        int n=nums.length;
        while(i<=j && j<n){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                swap(nums,i+1,j);
                i++;
                j++;
            }
        }
        return i+1;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}