class Solution {
    public int specialArray(int[] nums) {
        int res = 0, c = 0;
        for(int i=1;i<=nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]>=i)
                    c++;
            }
            if(c==i)
                return i;
            else
                c=0;
        }
        return (-1);
    }
}