class Solution {
    public int longestSubarray(int[] nums) {
        int t = 1, c = 1, m = nums[0];
        for(int i=1;i<nums.length;i++){
            m = Math.max(m,nums[i]);
        }
        for(int i=0;i<nums.length-1;i++){
            // t = Math.max(t&nums[i],t);
            if(nums[i]==m && nums[i]==nums[i+1] )
                c++;
            else 
                c = 1;
            t = Math.max(c,t);
        }
        return t;
    }
}