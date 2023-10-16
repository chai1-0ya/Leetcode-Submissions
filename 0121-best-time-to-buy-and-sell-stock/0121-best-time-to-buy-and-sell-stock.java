class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        int ans = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy)
                buy = prices[i];
            profit = prices[i]-buy;
            ans = Math.max(ans, profit);
        }
        return ans;
    }
}