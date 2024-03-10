class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(!ls.contains(nums1[i]))
                        ls.add(nums1[i]);
                }
            }
        }
        int[] ans = new int[ls.size()];
        for(int i=0;i<ls.size();i++) ans[i] = ls.get(i);
        return ans;
    }
}