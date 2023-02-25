class Solution {
    public int maxProfit(int[] prices) {
        int p,c=0,m;
        m = prices[0];
        for(int i=0;i<prices.length-1;i++){
            if(m>prices[i])
                m = prices[i];
            if((prices[i+1]-m)>c)
                c=prices[i+1]-m;
        }
        return c;
    }
}