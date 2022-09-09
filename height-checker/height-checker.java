class Solution {
    public int heightChecker(int[] h) {
        int[] f = new int[101];
        for(int i=0;i<h.length;i++){
            f[h[i]]++;
        }
        int res = 0;
        int c = 0;
        for(int i=0;i<h.length;i++){
            while(f[c]==0)
                c++;
            if(c != h[i])
                res++;
            f[c]--;
        }
        return res;
    }
}