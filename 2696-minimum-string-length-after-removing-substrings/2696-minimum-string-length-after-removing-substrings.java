class Solution {
    public int minLength(String s) {
        boolean f = true;
        int a = s.indexOf("AB");
        int b = s.indexOf("CD");
        while(s.indexOf("AB")>-1 || s.indexOf("CD")>-1){
            s=s.replace("AB","");
            s=s.replace("CD","");

            // }
        }
        return s.length();
    }
}