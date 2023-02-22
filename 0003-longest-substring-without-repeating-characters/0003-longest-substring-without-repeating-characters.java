class Solution {
    public int lengthOfLongestSubstring(String s) {
        int p=s.length();
        int maxlen=0;
        if(p==0)
            return 0;
        HashSet<Character> set=new HashSet<Character>();
        int i=0,j=0;
        while(j<p && i<=j){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                int len=set.size();
                maxlen=Math.max(len,maxlen);
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxlen;
        
    }
}