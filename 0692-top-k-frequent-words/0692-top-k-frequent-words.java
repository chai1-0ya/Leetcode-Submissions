class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ls = new LinkedList<>();
        Map<String, Integer> mp = new HashMap<>();
        for(int i=0;i<words.length;i++){
            int c = mp.getOrDefault(words[i], 0);
            mp.put(words[i], c+1);
        }
        
        // creating set of entries of map
        Set<Map.Entry<String, Integer>> set = mp.entrySet();
        
        // creating a list of entry objects
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(set);
        
        // sort the list using lambda expression
        Collections.sort(list, (l1,l2)->{
            if(l1.getValue() != l2.getValue())
                return -(l1.getValue().compareTo(l2.getValue()));
            else
                return (l1.getKey().compareTo(l2.getKey()));
            }
        );
        System.out.println(list);
        for(Map.Entry<String, Integer> val : list){
            if(k-->0)
                ls.add(val.getKey());
        }
        return ls;
    }
}