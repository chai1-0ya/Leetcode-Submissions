class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int c = 0;
        int[] arr = new int[nums.length];
        for(int j=0;j<nums.length;j++){
                if(nums[j]%2 == 0)
                    c += nums[j];
            }
        for(int i=0;i<nums.length;i++){
            int t = nums[queries[i][1]];
            nums[queries[i][1]] += queries[i][0];
            if(nums[queries[i][1]]%2 == 0 && t%2 == 0)
                arr[i] = c - t + nums[queries[i][1]];
            else if(nums[queries[i][1]]%2 == 0 && t%2 !=0)
                arr[i] = c + nums[queries[i][1]];
            else if(nums[queries[i][1]]%2 != 0 && t%2 == 0)
                arr[i] = c - t;
            else arr[i] = c;
            c = arr[i];
        }
        return arr;
    }
}