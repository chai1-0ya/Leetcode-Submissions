class Solution {
    public long largestPerimeter(int[] nums) {
        int n = nums.length;
        if(n<3) return -1;
        Arrays.sort(nums);
        long[] pre = new long[n];
        int idx = -1;
        pre[0] = nums[0];
        for(int i=1;i<n;i++){
            pre[i] = nums[i]+pre[i-1];
        }
        for(int i=n-1;i>=2;i--){
            if(nums[i]<pre[i-1]){
                idx = i;
                break;
            }
        }
        long sum = 0;
        for(int i=0;i<=idx;i++) sum+=nums[i];
        return idx==-1?-1:sum;
    }
}