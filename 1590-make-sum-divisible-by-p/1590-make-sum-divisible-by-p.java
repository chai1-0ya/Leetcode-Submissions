class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length, res = n, tar_rem = 0, cur = 0;
        for(int i : nums)
            tar_rem = (tar_rem + i) % p;

        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        for(int i = 0; i < n; ++i){
            cur = (cur + nums[i]) % p;
            mp.put(cur, i);
            int rem = (cur - tar_rem + p) % p;
            res = Math.min(res, i - mp.getOrDefault(rem, -n));
        }
        return res < n ? res : -1;
    }
}