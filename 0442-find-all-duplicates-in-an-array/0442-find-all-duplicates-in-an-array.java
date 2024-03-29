class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int x : nums){
            int idx = Math.abs(x);
            if(nums[idx-1]<0) ans.add(idx);
            else nums[idx-1] = -nums[idx-1];
        }
        return ans;
    }
}