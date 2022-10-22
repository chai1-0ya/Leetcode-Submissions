class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c = mp.getOrDefault(nums[i], 0);
            mp.put(nums[i], c+1);
        }
        for(Map.Entry<Integer, Integer> val : mp.entrySet()){
            if(val.getValue()>1){
                // System.out.println(val.getKey()+" "+val.getValue());
                return true;
            }
        }
        return false;
    }
}