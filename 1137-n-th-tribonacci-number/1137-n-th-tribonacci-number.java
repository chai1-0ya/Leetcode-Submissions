class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        return func(n,dp);
    }
    
    public int func(int n, int[] dp){
        if(dp[n]!=0)
            return dp[n];
        if(n==0)
            return dp[n] = 0;
        if(n==1)
            return dp[n] = 1;
        if(n==2)
            return dp[n] = 1;
        return dp[n] = func(n-1, dp)+func(n-2, dp)+func(n-3, dp);
    }
}