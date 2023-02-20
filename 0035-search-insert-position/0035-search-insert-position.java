class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int m;
        while(s<=e){
            m = e-s/2;
            if(target==nums[m])
                return m;
            else if(target<nums[m])
                e = m-1;
            else
                s = m+1;
        }
        return s;
    }
}