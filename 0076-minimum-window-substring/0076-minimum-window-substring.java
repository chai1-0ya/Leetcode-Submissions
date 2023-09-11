class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
            return "";
        Map<Character,Integer> temp = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            temp.put(c,temp.getOrDefault(c,0)+1);
        }
        int max = Integer.MAX_VALUE;
        int cnt = temp.size();  
        int i=0, j=0, start=0, end=0;
        String ans = "";
        while(j<s.length() && i<=j){
            if(temp.containsKey(s.charAt(j))){
                temp.put(s.charAt(j), temp.get(s.charAt(j))-1);
                if(temp.get(s.charAt(j))==0)
                    cnt--;
            }
            if(cnt==0){
                while(cnt==0){
                    if(temp.containsKey(s.charAt(i))){
                        temp.put(s.charAt(i), temp.get(s.charAt(i))+1);
                        if(temp.get(s.charAt(i))>0) cnt++;
                    }
                    if(max>j-i+1){
                        max = j-i+1;
                        start = i;
                        end = j;
                    }
                    i++;
                }
            }
            j++;
        }
        return max==Integer.MAX_VALUE?"":s.substring(start,end+1);
    }
}