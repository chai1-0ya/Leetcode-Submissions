class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        int s = -1, e = -1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(nums[m] == target){
                s = m;
                h = m-1;
            }
            else if(nums[m]<target)
                l = m+1;
            else 
                h = m-1;
        }
        l = 0;
        h = nums.length-1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(nums[m] == target){
                e = m;
                l = m+1;
            }
            else if(nums[m]<target)
                l = m+1;
            else 
                h = m-1;
        }
        return new int[]{s,e};
    }
}