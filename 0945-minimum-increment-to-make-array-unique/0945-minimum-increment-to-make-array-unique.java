class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int t = 0;
        int i = 1;
        while(i<nums.length){
            if(nums[i]<=nums[i-1]){
                nums[i]++;
                t++;
            }
            else i++;
        }
        return t;
    }
}