class Solution {
    public int minEatingSpeed(int[] piles, int hour) {
        Arrays.sort(piles);
        int l = 1, h = piles[piles.length-1];
        while(l<h){
            int mid = l + (h-l)/2;
            int t = 0;
            for(int x : piles){
                if(x%mid != 0)
                    t += x/mid + 1;
                else 
                    t += x/mid;
            }
            if(t>hour)
                l = mid+1;
            else 
                h = mid;
        }
        return l;
    }
}