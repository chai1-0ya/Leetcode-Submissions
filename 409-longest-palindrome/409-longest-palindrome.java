class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            int count = mp.getOrDefault(c,0);
            mp.put(c,count+1);
        }
        int even = 0, odd = 0;
        for(Map.Entry<Character, Integer> ch : mp.entrySet()){
            if(ch.getValue()%2==0)
                even += ch.getValue();
            else
                odd += ch.getValue() - 1;
            // System.out.println(ch.getKey()+" "+ch.getValue());
        }
         if(even==n)
             return n; 
        return even+odd+1;
    }
}