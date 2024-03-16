class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int presum = 0, cnt = 0;
        mp.put(presum,1);
        for(int i=0;i<nums.length;i++){
            presum += nums[i];
            int t = presum-k;
            if(mp.containsKey(t)){
                cnt += mp.get(t);
            }
            mp.put(presum, mp.getOrDefault(presum,0)+1);
        }
        return cnt;
    }
}