class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0)
            return 0;
        Arrays.sort(s);
        Arrays.sort(g);
        int t = 0;
        int i = 0, j = 0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                t++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return t;
    }
}