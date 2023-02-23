class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0;
        int h = 0;
        for(int i : nums){
            l = Math.max(l, i);
            h += i;
        }
        while(l<h){
            int mid = l+(h-l)/2;
            System.out.println(l+" "+mid+" "+h);
            int curr = 0, t = 1;
            for(int i : nums){
                if(curr + i > mid){
                    t++;
                    curr = 0;
                }
                curr += i;
            }
            System.out.println(t);
            if(t>k)
                l = mid+1;
            else 
                h = mid;
        }
        return l;
    }
}