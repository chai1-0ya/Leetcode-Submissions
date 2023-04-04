class Solution {
    public char nextGreatestLetter(char[] let, char target) {
        int l = 0;
        int h = let.length;
        while(l<h){
            int mid = l+(h-l)/2;
            if(let[mid]<=target)
                l = mid+1;
            else
                h = mid;
        }
        return let[l%let.length];
    }
}