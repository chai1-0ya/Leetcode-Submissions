class NumArray {
    
    int[] arr;
    int[] seg;
    int n = 0;
    
    public void segtree(int s, int e, int[] nums, int i){
        if(s==e){
            seg[i] = nums[s];
            return ;
        }
        if(s>e)
            return;
        int mid = s+(e-s)/2;
        segtree(s, mid, nums, 2*i);
        segtree(mid+1, e, nums, 2*i+1);
        seg[i] = seg[2*i]+seg[2*i+1];
    }
    
    public int query(int s, int e, int l, int r, int i){
        if(l>e || r<s){
            return 0;
        }
        if(s>=l && e<=r)
            return seg[i];
        int mid = s+(e-s)/2;
        int left = query(s, mid, l, r, 2*i);
        int right = query(mid+1, e, l, r, 2*i+1);
        return left+right;
    }

    public NumArray(int[] nums) {
        arr = nums;
        n = nums.length;
        seg = new int[n*4];
        segtree(0, n-1, nums, 1);
    }
    
    public void updt(int s,int e,int index,int val,int idx){
        if(s>e) return;
        if(s==e){
            seg[idx] = val;
        }else{
            int mid = s+(e-s)/2;
            if(index<=mid) updt(s,mid,index,val,2*idx);
            else updt(mid+1,e,index,val,2*idx+1);
            seg[idx] = seg[2*idx]+seg[2*idx+1];
        }
    }
    
    public void update(int index, int val) {
        updt(0,n-1,index,val,1);
    }
    
    public int sumRange(int left, int right) {
        return query(0, n-1, left, right, 1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */