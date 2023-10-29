class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zero++;
            else if(nums[i]==1) one++;
            else two++;
        }
        int i=0;
        for(;i<zero;i++)
            nums[i]=0;
        int t = i;
        for(;i<t+one;i++)
            nums[i]=1;
        t = i;
        for(;i<t+two;i++)
            nums[i]=2;
    }
}