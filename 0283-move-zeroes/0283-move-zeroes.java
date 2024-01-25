class Solution {
    public void moveZeroes(int[] nums) {
        int t = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[t]=nums[i];
                t++;
            }
        }
        for(;t<nums.length;t++) nums[t]=0;
    }
}