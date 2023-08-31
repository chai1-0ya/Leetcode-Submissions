class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> s = new HashSet<>();
        int c = 0;
        for(int i=0;i<allowed.length();i++)
            s.add(allowed.charAt(i));
        for(int i=0;i<words.length;i++){
            int t = 0;
            for(int j=0;j<words[i].length();j++){
                if(!s.contains(words[i].charAt(j)))
                    t++;
            }
            if(t==0)
                c++;
        }
        return c;
    }
}