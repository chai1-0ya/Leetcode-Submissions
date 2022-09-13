class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<logs.length;i++){
            s.add(logs[i][0]);
        }
        int[] arr = new int[k];
        Set<Integer> a = new HashSet<>();
        Map<Integer,Integer> mp = new HashMap<>();
        for(int x : s){
            for(int i=0;i<logs.length;i++){
                if(logs[i][0]==x){
                    a.add(logs[i][1]);
                }
            }
            if(mp.containsKey(a.size())){
                int c = mp.get(a.size()) + 1;
                mp.put(a.size(),c);
            }
            else 
                mp.put(a.size(),1);
            a.clear();
        }
        // int i=0;
        for (Map.Entry<Integer,Integer> me : mp.entrySet()){
            arr[me.getKey()-1] = me.getValue();
        }
        s.clear();
        mp.clear();
        return arr;
    }
}