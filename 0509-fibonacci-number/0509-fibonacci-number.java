class Solution {
    public int fib(int n) {
        int[] a = new int[31];
        a[1] = a[2] = 1;
        for(int i=3;i<=n;i++){
            a[i] = a[i-1]+a[i-2];
        }
        return a[n];
    }
}