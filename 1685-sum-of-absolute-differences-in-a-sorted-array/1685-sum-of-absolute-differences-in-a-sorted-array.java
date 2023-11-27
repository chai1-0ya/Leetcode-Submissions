class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suff = new int[nums.length];
        pre[0] = nums[0];
        suff[nums.length-1] = nums[nums.length-1];
        for(int i=1;i<nums.length;i++) pre[i] = pre[i-1]+nums[i];
        for(int i=nums.length-2;i>=0;i--) suff[i] = suff[i+1]+nums[i];
        int[] res = new int[nums.length];
        res[0] = suff[0]-nums[0]*nums.length;
        res[nums.length-1] = nums[nums.length-1]*nums.length - suff[0];
        for(int i=1;i<nums.length-1;i++){
            res[i] = (nums[i]*i-pre[i-1]) + (suff[i+1]-nums[i]*(nums.length-i-1));
        }
        return res;
    }
}