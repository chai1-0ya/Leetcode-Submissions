class Solution {
    public boolean isPowerOfTwo(int n) {
        int t = 0;
        // if(n==0)
        //     return false;
        while(n>0){
            n = (n&(n-1));
            t++;
        }
        if(t==1)
            return true;
        return false;
    }
}