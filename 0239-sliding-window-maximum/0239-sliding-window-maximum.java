   class Solution {
    
    int[] segment;
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        segment = new int[4*n];
        Arrays.fill(segment, Integer.MIN_VALUE);
        segtree(0, n-1, nums, 1);
        int[] ans = new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            ans[i] = query(0, n-1, i, i+k-1, 1);
        }
        // for(int i: segment)
        //     System.out.println(i);
        return ans;
    }
    
    public void segtree(int s, int e, int[] nums, int i){
        if(s==e){
            segment[i] = nums[s];
            return;
        }
        if(s>e)
            return;
        int mid = s+(e-s)/2;
        segtree(s, mid, nums, i*2);
        segtree(mid+1, e, nums, i*2+1);
        segment[i] = Math.max(segment[i*2], segment[i*2+1]);
    }
    
    public int query(int start, int end, int l, int r, int i){
        if(l>end || r<start){
            return Integer.MIN_VALUE;
        }
        if(l<=start && r>=end){
            return segment[i];
        }
        int mid = start+(end-start)/2;
        int lt = query(start, mid, l, r, 2*i);
        int rt = query(mid+1, end, l, r, 2*i+1);
        return Math.max(lt, rt);
    }
}