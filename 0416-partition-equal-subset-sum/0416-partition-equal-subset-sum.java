class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        if(sum%2!=0)
            return false;
        else{
            sum = sum/2;
            int[][] dp = new int[nums.length+1][sum+1];
            for(int i=0;i<=nums.length;i++)
                Arrays.fill(dp[i], -1);
            int i = 0;
            return xxx(i, sum, nums, dp) == 0 ? false : true;
        }
    }
    
    int xxx(int i, int sum, int[] nums, int[][] dp){
        if(sum<0) return 0;
        if(i>=nums.length && sum != 0)
            return dp[i][sum] = 0;
        if(sum == 0)
            return dp[i][sum] = 1;
        if(dp[i][sum] != -1)
            return dp[i][sum];
        return dp[i][sum] = (xxx(i+1, sum-nums[i], nums, dp) | xxx(i+1, sum, nums, dp));
    }
    
    
}