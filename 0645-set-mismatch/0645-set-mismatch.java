class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int nsum = 0;
        for(int a : nums)
            nsum += a;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int c = mp.getOrDefault(nums[i], 0);
            mp.put(nums[i], c+1);
        }
        sum = sum - nsum;
        for(Map.Entry<Integer, Integer> val : mp.entrySet()){
            if(val.getValue()>1){
                nsum = val.getKey();
                break;
            }
        }
        return new int[]{nsum , sum+nsum};
    }
}