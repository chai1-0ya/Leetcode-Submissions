class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int pdt = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(pdt==0)
                pdt = 1;
            pdt *= nums[i];
            max = Math.max(max,pdt);
        }
        pdt = 1;
        for(int i=n-1;i>=0;i--){
            if(pdt==0)
                pdt = 1;
            pdt *= nums[i];
            max = Math.max(max, pdt);
        }
        return max;
    }
}