class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0)
            return false;
        double a = Math.log(n)/Math.log(4);
        a = (int)(a + 0.5);
        return Math.pow(4,a)==n;
    }
}