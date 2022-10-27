class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int a : nums){
            if(a != 0)
                s.add(a);
        }
        return s.size(); 
    }
}