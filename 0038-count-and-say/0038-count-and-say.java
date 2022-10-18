class Solution {

     // s = "";
    
    public String countAndSay(int n) {
        if(n==1)
             return "1";
        if(n==2)
            return "11";
        String s = countAndSay(n-1);
        int c = 1;
        String ss = "";
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1))
                c++;
            else {
                ss += Integer.toString(c) + s.charAt(i-1);
                c = 1;
            }
        }
        ss += Integer.toString(c) + s.charAt(s.length()-1);
        return ss;
    }
}