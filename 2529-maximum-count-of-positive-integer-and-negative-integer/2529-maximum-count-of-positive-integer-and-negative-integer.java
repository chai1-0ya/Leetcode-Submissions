class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0, neg = 0;
        if(nums[0] >0 || nums[nums.length-1]<0)
            return nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                pos++;
            if(nums[i]<0)
                neg++;
        }
        return Math.max(pos,neg);
    }
}