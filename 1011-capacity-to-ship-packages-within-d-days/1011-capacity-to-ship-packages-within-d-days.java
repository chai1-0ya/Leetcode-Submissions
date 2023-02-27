class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, h = 0;
        for(int w: weights){
            l = Math.max(l, w);
            h += w;
        }
        while(l < h){
            // System.out.println(l+" "+h);
            int mid = (l + h) / 2, need = 1, cur = 0;
            for(int w: weights){
                if(cur + w > mid){
                    need += 1;
                    cur = 0;
                }
                cur += w;
            }
            // if(need==days)
            //     return mid;
            if(need > days)
                l = mid + 1;
            else
                h = mid;
        }
        return l;
    }
}