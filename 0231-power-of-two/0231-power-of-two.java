class Solution {
    int m =0;
    public boolean isPowerOfTwo(int n) {
        if(n==Math.pow(2,m))
        {
            return true ;
            
        }
        else if(Math.pow(2,m)>n){
            return false;
        }
        m++;
        return isPowerOfTwo(n);
            
            
    }
}