class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int sum = 0, ans = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum==k)
                ans++;
            if(mp.containsKey(sum-k))
                ans += mp.get(sum-k); 
            mp.put(sum, mp.getOrDefault(sum, 0)+1);
        }
        return ans;
    }
}