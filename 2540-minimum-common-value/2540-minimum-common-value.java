class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> t = new TreeSet<>();
        for(int x : nums1)
            t.add(x);
        for(int x : nums2){
            if(t.contains(x))
                return x;
        }
        return -1;
    }
}