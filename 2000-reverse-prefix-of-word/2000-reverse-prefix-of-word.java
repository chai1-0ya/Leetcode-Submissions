class Solution {
    public String reversePrefix(String w, char ch) {
        int idx = w.indexOf(ch);
        if(idx == -1) 
            return w;
        String s = "";
        for(int i=0;i<=idx;i++){
            s = w.charAt(i)+s;
        }
        return s+w.substring(idx+1);
    }
}