class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        if(piles.length==h)
            return piles[piles.length-1];
        int min = 1, max = 1000000000;
        int ans = 0;
        int x = h;
        while(min<max){
            int mid = (min + max)/2;
            int c = 0;
            for(int i=0;i<piles.length;i++){
                // if(piles[i]<mid)
                    c += (piles[i]+mid-1)/mid;
                // else
                //     c += ((double)piles[i]/mid);
            }
            System.out.println(c+" "+mid);
            // if(c==x)
            //     return mid;
            if(c>x)
                min = mid+1;
            else 
                max = mid;
            System.out.println(min+" "+max);
        }
        return min;
    }
}