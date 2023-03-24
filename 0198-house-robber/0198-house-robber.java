class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return func(0, 0, nums,dp);
    }

    public int func(int i, int sum, int[] arr,int[] dp){
        if(i>=arr.length)
            return sum;
        if(dp[i]!=-1) return dp[i];
        int a=arr[i]+func(i+2,sum,arr,dp);
        int b=func(i+1,sum,arr,dp);
        return dp[i] = Math.max(a,b);
    }
}