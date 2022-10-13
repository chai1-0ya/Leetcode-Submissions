class Solution {
    public int largestPerimeter(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            // int s = 0;
            if(nums[i]<nums[i+1]+nums[i+2]){
                if(nums[i+1]<nums[i]+nums[i+2]){
                    if(nums[i+2]<nums[i+1]+nums[i])
                        max = Math.max(max, nums[i]+nums[i+1]+nums[i+2]);
                }
            }
        }
        return max;
    }
}