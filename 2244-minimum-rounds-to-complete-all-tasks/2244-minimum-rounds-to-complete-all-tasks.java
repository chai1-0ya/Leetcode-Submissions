class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            int c = mp.getOrDefault(tasks[i],00);
            mp.put(tasks[i],c+1);
        }
        // int[] a = new int[mp.size()];
        // int j = 0;
        int t = 0;
        for(int i : mp.values()){
            if(i == 1)
                return -1;
            else if(i%3==0)
                t+=i/3;
            else
                t+=i/3+1;
        }
        // System.out.println(Arrays.toString(a));
        return t;
    }
}