class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int i,k=0;
        for(i = s.length()-1;i>=0;--i){
            if(s.charAt(i)==' ')
                break;
            k++;
        }
        return k;
        
    }
}