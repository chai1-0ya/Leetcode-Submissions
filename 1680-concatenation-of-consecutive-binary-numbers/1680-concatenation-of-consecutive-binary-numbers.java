class Solution {
    public int concatenatedBinary(int n) {
        long mod = 1000000007;
        long res = 1;
        for(int i=2;i<=n;i++){
            // int c = (int)(Math.log(i)/Math.log(2)) + 1;
            int t = i;
            int c = 0;
            while (t != 0){
                c++;
                t = t>>>1;
            }
            res = ((res<<c) % mod + i) % mod;
            // res = (res+i)%mod;
            // System.out.println(res);
        }
        return (int)res;
    }
}