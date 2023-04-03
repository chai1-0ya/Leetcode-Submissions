class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        for(int i=0;i<arr1.length;i++){
            int t = 0;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])>d)
                    t++;
            }
            if(t==arr2.length)
                ans++;
        }
        return ans;
    }
}