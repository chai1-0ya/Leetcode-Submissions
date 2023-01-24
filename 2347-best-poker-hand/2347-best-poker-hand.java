class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hp = new HashMap<>();
        for(int i=0; i<ranks.length; i++){
            if(hm.containsKey(ranks[i])){
                int ab= hm.get(ranks[i]);
                int cd = ab+1;
                hm.put(ranks[i], cd);
         }
         else{
             hm.put(ranks[i],1);
         }
        } 
        for(int i=0; i<suits.length; i++){
                 if(hp.containsKey(suits[i])){
                int ab= hp.get(suits[i]);
                int cd = ab+1;
                hp.put(suits[i], cd);
         }
         else{
             hp.put(suits[i],1);
         }
        }
        ArrayList<Integer> al= new ArrayList<>();
        for(int key : hm.keySet()){
           al.add(hm.get(key));
        }
        Collections.sort(al, Collections.reverseOrder());
        for(int i=0; i<al.size(); i++){
            if(al.get(i)>=3){
                return "Three of a Kind";
            }
            else if(al.get(i)==2){
                return "Pair";
            }
        }
        for(char key:hp.keySet()){
            if(hp.get(key)==5){
                return "Flush";
            }
        }
        return "High Card";
    }
}