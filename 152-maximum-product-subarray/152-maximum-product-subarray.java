class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0], c = 1;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                c *= nums[j];
                // System.out.println(c);
                res = Math.max(res, c);
            }
            c = 1;
        }
        return res;
    }
}