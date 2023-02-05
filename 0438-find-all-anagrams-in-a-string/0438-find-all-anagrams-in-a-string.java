class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = s.length();
        int n = p.length();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(m<n){
            return list;
        }
  
        int[] freq_p = new int[26];
        int[] freq_s = new int[26];
        
        for(int i=0;i<p.length();i++){
            freq_p[p.charAt(i)-'a']++;
            freq_s[s.substring(0,n).charAt(i)-'a']++;
        }
        
        if(areSame(freq_p , freq_s)){
            list.add(0);
        }
        
        for(int i=n;i<m;i++){
            freq_s[s.charAt(i-n)-'a']--;
            freq_s[s.charAt(i)-'a']++;
            if(areSame(freq_p , freq_s))
                list.add(i-n+1);
        }
        return list;
    }
    
    private boolean areSame(int[] arr1, int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
}

