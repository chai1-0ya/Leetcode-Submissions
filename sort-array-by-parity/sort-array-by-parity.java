class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0, r = nums.length-1;
        while(l<r){
            if(nums[l]%2==0)
                l++;
            else {
                nums[l] = nums[l]+nums[r];
                nums[r] = nums[l]-nums[r];
                nums[l] = nums[l]-nums[r];
                r--;
            }
            // if(nums[r]%2!=0)
            //     r--;
            // else {
            //     swap;
            // }
        }
        return nums;
    }
}