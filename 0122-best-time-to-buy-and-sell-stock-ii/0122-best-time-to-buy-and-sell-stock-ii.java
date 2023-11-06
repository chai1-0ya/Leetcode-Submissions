class Solution {
    public int maxProfit(int[] p) {
        int pft = 0;
        for(int i=1;i<p.length;i++){
            if(p[i]>p[i-1])
                pft+=p[i]-p[i-1];
        }
        return pft;
    }
}