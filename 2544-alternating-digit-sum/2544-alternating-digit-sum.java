class Solution {
    public int alternateDigitSum(int n) {
        int s = 0, sign = 1;
        while(n>0){
            sign *= -1;
            int x = n%10;
            n = n/10;
            s += sign*x;
        }
        return s*sign;
    }
}