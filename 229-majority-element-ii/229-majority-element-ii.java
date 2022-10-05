class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        // n = n/3;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int c = mp.getOrDefault(nums[i], 0);
            mp.put(nums[i], c+1);
        }
        n = n/3;
        List<Integer> l = new ArrayList<>();
        for(Map.Entry<Integer, Integer> val : mp.entrySet()){
            // System.out.println(val.getKey()+" "+val.getValue());
            if(val.getValue() > n)
                l.add(val.getKey());
        }
        return l;
    }
}