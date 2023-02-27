class Solution {
    public int maxDistance(int[] pos, int m) {
        Arrays.sort(pos);
        int n = pos.length;
        int h = pos[n-1]-pos[0];
        int l = 1;
        int ans = 0;
        while(l<=h){
            int mid = l + (h-l)/2;
            int count = 1;
            int prev = pos[0];
            for(int i=1;i<n;i++){
                if(pos[i]-prev >=mid){
                    prev = pos[i];
                    count++;
                }
                if(count>m)
                    break;
            }
            if(count>=m){
                ans = mid;
                l = mid+1;
            }
            else
                h = mid-1;
        }
        return ans;
    }
}