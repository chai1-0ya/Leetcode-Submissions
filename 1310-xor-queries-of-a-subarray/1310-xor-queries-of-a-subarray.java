class Solution {
    
    int[] segtree;
    
    public void build(int s, int e, int[] arr, int i){
        if(s==e){
            segtree[i] = arr[s];
            return;
        }
        if(s>e)
            return;
        int mid = s+(e-s)/2;
        build(s, mid, arr, 2*i);
        build(mid+1, e, arr, 2*i+1);
        segtree[i] = segtree[2*i] ^ segtree[2*i+1];
    }
    
    public int query(int s, int e, int l, int r, int[] arr, int i){
        if(s>r || e<l)
            return 0;
        if(s>=l && e<=r)
            return segtree[i];
        int mid = s+(e-s)/2;
        int left = query(s, mid, l, r, arr, 2*i);
        int right = query(mid+1, e, l, r, arr, 2*i+1);
        return left^right;
    }
    
    public int[] xorQueries(int[] arr, int[][] queries) {
        segtree = new int[arr.length*4];
        int[] ans = new int[queries.length];
        build(0, arr.length-1, arr, 1);
        for(int i=0;i<queries.length;i++){
            ans[i] = query(0, arr.length-1, queries[i][0], queries[i][1], arr, 1);
        }
        return ans;
        
    }
}