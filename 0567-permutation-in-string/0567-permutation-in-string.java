class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        Map<Character, Integer> mp1 = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();
        for(int i=0;i<n;i++){
            char c = s1.charAt(i);
            mp1.put(c, mp1.getOrDefault(c,0)+1);
        }
        // System.out.println(mp1);
        for(int i=0;i<=m-n;i++){
            for(int j=i;j<i+n;j++){
                char c = s2.charAt(j);
                if(!mp1.containsKey(c)){
                    i=j;
                    mp2.clear();
                    break;
                }
                mp2.put(c, mp2.getOrDefault(c,0)+1);
            }
            // System.out.println(mp2);
            if(mp1.equals(mp2))
                return true;
            mp2.clear();
        }
        return false;
    }
}