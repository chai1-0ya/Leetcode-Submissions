class Solution {
    public int destroyTargets(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        // int[] arr = new int[n];
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int c = mp.getOrDefault(nums[i]%k, 0);
            mp.put(nums[i]%k, c+1);
        }
        int f = 0;
        int m = (int)1e9;
        for(Map.Entry<Integer, Integer> val : mp.entrySet()){
            if(f<val.getValue()){
                f = val.getValue();
                // m = val.getKey();
            }
        }
        // System.out.println(f+" "+m);
        for(int i=0;i<n;i++){
            if(mp.get(nums[i]%k) == f)
                m = Math.min(m, nums[i]);
        }
        return m;
        // for(int i=0)
    }
}