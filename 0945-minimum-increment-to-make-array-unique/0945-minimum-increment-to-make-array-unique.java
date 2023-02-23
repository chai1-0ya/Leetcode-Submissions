class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int t = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                t += nums[i-1]-nums[i]+1;
                nums[i] = nums[i-1]+1;
            }
        }
        return t;
    }
}