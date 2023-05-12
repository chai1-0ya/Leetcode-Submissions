class Solution {
    
    public int solve(int[] a, int[] b, int[][] dp, int i, int j){
        if(i<0 || j<0)
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];
        if(a[i]==b[j])
            return dp[i][j] = 1+solve(a, b, dp, i-1, j-1);
        return dp[i][j] = Math.max(solve(a, b, dp, i-1, j),solve(a, b, dp, i, j-1));
    }
    
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(nums1, nums2, dp, n-1, m-1);
    }
}