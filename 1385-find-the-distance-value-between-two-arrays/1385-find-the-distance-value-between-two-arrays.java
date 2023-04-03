class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            int t = 0;
            int l = 0;
            int h = arr2.length-1;
            boolean flag = false;
            while(l<=h){
                int mid = l+(h-l)/2;
                if(Math.abs(arr2[mid]-arr1[i])<=d){
                    flag = true;
                    break;
                }
                else if(arr2[mid]<arr1[i]) 
                    l = mid+1;
                else 
                    h = mid-1;
            }
            if(!flag)
                ans++;
        }
        return ans;
    }
}