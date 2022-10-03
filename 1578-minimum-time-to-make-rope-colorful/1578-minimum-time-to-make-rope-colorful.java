class Solution {
    public int minCost(String col, int[] nt) {
        int n = col.length();
        int[] arr = new int[n];
        int j = 0, k = nt[0];
        for(int i=1;i<n;i++){
            if(col.charAt(i)==col.charAt(i-1)){
                
                j += Math.min(nt[i],k);
                k = Math.max(nt[i], k);
            }
            else k = nt[i];
                // arr[j++] = Math.min(nt[i],nt[i-1]);
        }
        return j;
    }
}