class Solution {
    public String bestHand(int[] ranks, char[] s) {
        Map<Integer, Integer> mp = new HashMap<>();
        int three = 0, two = 0;
        for(int i=0;i<5;i++){
            mp.put(ranks[i], mp.getOrDefault(ranks[i], 0)+1);
        }
        if(s[0]==s[1] && s[1]==s[2] && s[2]==s[3] && s[3]==s[4])
            return "Flush";
        else{
            for(Map.Entry<Integer, Integer> val : mp.entrySet()){
                // System.out.println(val.getValue());
                if(val.getValue()>=3)
                    three++;
                else if(val.getValue()==2)
                    two++;
            }
        }
        if(three > 0)
            return "Three of a Kind";
        else if(two > 0)
            return "Pair";
        else 
            return "High Card";
    }
}