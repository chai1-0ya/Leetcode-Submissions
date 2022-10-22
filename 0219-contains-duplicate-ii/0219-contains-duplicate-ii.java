class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k == 0)
            return false;
        // int i = 0, j = k;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                int c = mp.get(nums[i]);
                if(Math.abs(c-i)<=k)
                    return true;
            }
            mp.put(nums[i], i);
        }
        return false;
    }
}