class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] fre = new int[101];
        for(int i=0;i<nums.length;i++){
            fre[nums[i]]++;
        }
        int ans = 0;
        Arrays.sort(fre);
        int mxfre = fre[100];
        for(int i : fre){
            if(i==mxfre)
                ans+=i;
        }
        return ans;
    }
}