class Solution {
    public int distinctIntegers(int n) {
        long t = 0;
        if(n==1 || n==2)
            return 1;
        else return n-1;
    }
}