class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if(n == 1)
            return "";
        char[] crr = palindrome.toCharArray();
        for(int i=0;i<n/2;i++){
            if(crr[i] != 'a'){
                crr[i] = 'a';
                return String.valueOf(crr);
            }
        }
        crr[n-1] = 'b';
        return String.valueOf(crr);
    }
}