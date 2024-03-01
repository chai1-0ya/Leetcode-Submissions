class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> ls = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++) mp.put(nums[i], i);
        for(int i=0;i<n;i++){
            int sum = 0-nums[i];
            for(int j=0;j<n;j++){
                List<Integer> l = new ArrayList<>();
                int t = sum - nums[j];
                // System.out.println(sum+" "+t);
                if(i != j && mp.containsKey(t) && mp.get(t)!=j && mp.get(t)!=i){
                    // System.out.println(nums[i]+" "+nums[j]+" "+t);
                    l.add(nums[i]); l.add(nums[j]); l.add(t);
                    Collections.sort(l);
                    s.add(l);
                }
            }
        }
        ls.addAll(s);
        return ls;
    }
}