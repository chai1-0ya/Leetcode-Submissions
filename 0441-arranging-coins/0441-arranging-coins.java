class Solution {
    public int arrangeCoins(int n) {
        if(n==1){
            return 1;
        }
        int i;
        
        for(i=1;i<n;i++){
            if((long)(i*(i+1l)/2l)>n){
                return i-1;
            }
        }
        return i-1;
    }
}