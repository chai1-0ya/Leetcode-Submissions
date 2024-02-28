class Solution {
    
    public boolean helper(String s1, String s2){
        int n = s1.length();
        String a = s2.substring(0,n);
        String b = s2.substring(s2.length()-n);
        // System.out.println(a+" "+b+" "+s1);
        if(s1.equals(a) && s1.equals(b))
            return true;
        return false;
    }
    
    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].length()<=words[j].length() && helper(words[i], words[j]))
                    ans++;
            }
        }
        return ans;
    }
}