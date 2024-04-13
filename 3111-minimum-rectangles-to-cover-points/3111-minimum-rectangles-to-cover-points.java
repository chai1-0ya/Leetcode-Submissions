class Solution {
    public int minRectanglesToCoverPoints(int[][] pts, int w) {
        int n = pts.length;
        int[] x = new int[n];
        for(int i=0;i<n;i++) x[i] = pts[i][0];
        Arrays.sort(x);
        // if(w==0) return n;
        int t=1, i=1, j=0;
        while(i<n){
            if(x[i]-x[j] <= w) i++;
            else {
                t++;
                j=i;
            }
        }
        return t;
    }
}