class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        // int i, j;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[(i-1+n)%n]){
                // System.out.println(i+" "+(i-1+n)%n);
                return nums[i];
            }
        }
        return nums[0];
    }
}