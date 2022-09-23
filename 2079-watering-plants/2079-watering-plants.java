class Solution {
    public int wateringPlants(int[] p, int cap) {
        int c = 0;
        int t = cap;
        for(int i=0;i<p.length;i++){
            if(p[i]<=t){
                t = t-p[i];
                c++;
            }
            else{
                c = c + 2*i + 1;
                t = cap;
                t = t - p[i];
            }
            // System.out.println(t+" "+c);
        }
        return c;
    }
}