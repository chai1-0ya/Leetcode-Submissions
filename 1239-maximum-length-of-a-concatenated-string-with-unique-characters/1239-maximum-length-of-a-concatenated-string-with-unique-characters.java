class Solution {
    
    int l = 0;
    String s = "";
    
    public boolean check(String s){
        Set<Character> st = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(st.contains(s.charAt(i)))
                return false;
            st.add(s.charAt(i));
        }
        return true;
    }
    
    public void subs(List<String> arr, String s, int i){
        if(check(s)==false)
            return;
        l = Math.max(l, s.length());
        if(i==arr.size())
            return;
        subs(arr, s+arr.get(i), i+1);
        subs(arr, s, i+1);
    }
    
    public int maxLength(List<String> arr) {
        // String s = "";
        subs(arr, s, 0);
        return l;
    }
}