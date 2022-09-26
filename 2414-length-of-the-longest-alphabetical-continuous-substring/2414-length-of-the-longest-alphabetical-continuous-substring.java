class Solution {
    public int longestContinuousSubstring(String s) {
        int n = 1, t = 1;
        char c = s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)-1 == c){
                c = s.charAt(i);
                t++;
                // System.out.println(t);
            }
            else{
                t = 1;
                c = s.charAt(i);
            }
            // n = Math.max(t, n);
            if(t>n)
                n = t;
        }
        return n;
    }
}