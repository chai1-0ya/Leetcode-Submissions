class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] map = new int[26];
        for(int i = 0;i < order.length();i++){
            map[order.charAt(i) - 'a'] = i;
        }
        for(int i = 1;i < words.length;i++){
            String f = words[i - 1];
            String s = words[i];
            int n = Math.min(f.length(),s.length());
            boolean fl = false;
            for(int j = 0;j < n;j++){
                if(map[f.charAt(j) - 'a'] < map[s.charAt(j) - 'a']){
                    fl = true;
                    break;
                }
            else if(map[f.charAt(j) - 'a'] > map[s.charAt(j) - 'a']){
                    return false;
                }
            }
            if(!fl && f.length() > s.length()){
                return false;
            }
        }
        return true;
    }
}