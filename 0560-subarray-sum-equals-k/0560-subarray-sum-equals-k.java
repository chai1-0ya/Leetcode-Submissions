class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int presum = 0;
        int cnt = 0;
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            presum += nums[i];
            if(mp.containsKey(presum-k))
                cnt += mp.get(presum-k);
            mp.put(presum, mp.getOrDefault(presum,0)+1);
        }
        return cnt;
    }
}