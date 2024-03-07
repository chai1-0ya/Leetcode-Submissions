class Solution {
    public int[] twoSum(int[] nums, int t) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c = t-nums[i];
            if(mp.containsKey(c))
                return new int[] {mp.get(c), i};
            mp.put(nums[i],i);
        }
        return null;
    }
}