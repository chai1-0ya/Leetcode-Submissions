class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i=0, j=0;
        int maxlen = 0;
        List<Character> ch = new ArrayList<>();
        // ch.add(s.charAt(j));
        // j++;
        while(j<n && i<=j){
            if(!contains(ch, s.charAt(j))){
                ch.add(s.charAt(j));
                int len = ch.size();
                maxlen = Math.max(maxlen, len);
                j++;
            }
            else{
                ch.remove(Character.valueOf(s.charAt(i)));
                i++;
            }
        }
        return maxlen;
    }
    
    public boolean contains(List<Character> ch, char c){
        for(int i=0;i<ch.size();i++){
            if(ch.get(i)==c)
                return true;
        }
        return false;
    }
}