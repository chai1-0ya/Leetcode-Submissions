class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        int a = (int)(Math.log(n)/Math.log(2));//+1e-10;
        // System.out.println(a);
        
        return Math.pow(2,a)==n;
    }
}