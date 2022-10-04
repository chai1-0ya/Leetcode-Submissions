class Solution {
    public boolean checkPossibility(int[] nums) {
        int t = 0;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1] > nums[i]){
                t++;
                if(i>1 && nums[i-2]<=nums[i])
                    nums[i-1] = nums[i];
                else if(i>1)
                    nums[i] = nums[i-1];
            }
        }
        // if(n>1 && nums[n-2]>nums[n-1])
        //     t++;
        if(t==1 || t==0)
            return true;
        return false;
    }
}