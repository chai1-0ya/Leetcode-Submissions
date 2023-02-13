class Solution {
    public int countOdds(int l, int h) {
    int t = h-l+1;
    if(l%2 !=0 && h%2 !=0)
        return t/2+1;
    else
        return t/2;
    }
}