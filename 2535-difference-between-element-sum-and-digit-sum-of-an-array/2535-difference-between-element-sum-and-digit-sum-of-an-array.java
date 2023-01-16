class Solution {
    public int differenceOfSum(int[] nums) {
        int esum = 0;
        int dsum = 0;
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            esum+=x;
            while(x!=0){
                dsum+=x%10;
                x=x/10;
            }
        }
        return Math.abs(esum-dsum);
    }
}