class Solution {
    public int minimumLength(String s) {
        return minstr(s, 0, s.length()-1);
    }
    
    public int minstr(String s, int i, int e){
        if(i>=e || s.charAt(i)!=s.charAt(e))
            return e-i+1;
        else{
            char c = s.charAt(i);
            while(i<=e && s.charAt(i)==c)
                i++;
            while(i<=e && s.charAt(e)==c)
                e--;
            return minstr(s, i, e);
        }
    }
    
}