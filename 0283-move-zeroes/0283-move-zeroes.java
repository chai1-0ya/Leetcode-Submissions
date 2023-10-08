class Solution {
    
    public void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    
    public void moveZeroes(int[] nums) {
        int i=0, j=0;
        while(j<nums.length){
            if(nums[j]==0){
                j++;
            }
            else{
                swap(nums,i,j);
                i++;
                j++;
            }
        }
    }
}