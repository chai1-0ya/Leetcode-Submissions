class Solution {
    public int pivotInteger(int n) {
        int sum = n*(n+1)/2;
        for(int i=1;i<=n;i++){
            int l = i*(i+1)/2;
            int r = sum-l+i;
            if(l==r) return i;
        }
        return -1;
        
    }
}