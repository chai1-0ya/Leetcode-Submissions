class Solution {
    public long minimalKSum(int[] nums, int k) {
        long t = k;
        int n = nums.length;
        Arrays.sort(nums);
        long ans = t*(t+1)/2;
        // System.out.println(ans);
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            // s.add(i);
            if(i<=t && !s.contains(i)){
                s.add(i);
                ans = ans-i+t+1;
                // System.out.println(i+" "+(k+1)+" "+ans);
                t++;
            }
        }
        return ans;
    }
}