class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0)
            return false;
        double a = (Math.log(n)/Math.log(3));
        a = (int) (a + 0.5);
        // System.out.println(Math.pow(3,a));
        return Math.pow(3,a)==n;
    }
}