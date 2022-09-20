class Solution {
    public int mySqrt(int x) {
        int a = 0;
        int start = 1, end = x;
        int mid = 0;
        if(x==0)
            return 0;
        while(start<end){
            mid = start+(end-start) / 2;
            if(mid <= x/mid && (mid+1) > x/(mid+1))
                return mid;
            else if(mid > x/mid){
                end = mid;
                // a = end;
            }
            else{
                a = start;
                start = mid + 1;
            }
        }
        return start;
    }
}