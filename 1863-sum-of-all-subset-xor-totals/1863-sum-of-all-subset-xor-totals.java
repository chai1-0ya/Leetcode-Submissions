class Solution {
    public int subsetXORSum(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i=0;i<(1<<n);i++){
            int xor = 0;
            for(int j=0;j<n;j++){
                if((i & (1 << j)) > 0)
                    xor ^= nums[j];
            }
            ans += xor;
        }
        return ans;
    }
}