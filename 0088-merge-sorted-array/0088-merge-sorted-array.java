class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int last = n+m-1;
        n--; m--;
        while(n>=0 && m>=0){
            if(a[m]>b[n]){
                a[last] = a[m];
                last--;
                m--;
            }
            else {
                a[last] = b[n];
                n--;
                last--;
            }
        }
        while(n>=0){
            a[last] = b[n];
            last--;
            n--;
        }
    }
}