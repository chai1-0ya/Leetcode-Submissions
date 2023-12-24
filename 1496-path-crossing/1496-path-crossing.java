class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int x = 0, y = 0;
        set.add(x+"#"+y);
        for(int i=0;i<path.length();i++){
            char c = path.charAt(i);
            if(c=='N') y++;
            if(c=='S') y--;
            if(c=='E') x++;
            if(c=='W') x--;
            String str = x+"#"+y;
            if(set.contains(str)) return true;
            set.add(str);
        }
        return false;
    }
}