class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length+1];
        int[] ans = new int[2];
        for(int a : nums)
            arr[a]++;
        for(int i=1;i<nums.length+1;i++){
            if(arr[i]==2)
                ans[0] = i;
            if(arr[i]==0)
                ans[1] = i;
        }
        return ans;
    }
}