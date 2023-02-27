class Solution {
    public int minimizedMaximum(int n, int[] q) {
        int m = q.length;
        if(n==1 && m==1)
            return q[0];
        int l = 1;
        Arrays.sort(q);
        int h = q[m-1];
        int ans = 0;
        while(l<h){
            int mid = l+(h-l)/2;
            int t = 0;
            int j = 0;
            while(j<m){
                t += (q[j] + mid - 1) / mid;
                j++;
            }
            if(t > n){
                // ans = mid;
                l = mid+1;
            }
            else 
                h = mid;
        }
        return l;
    }
}