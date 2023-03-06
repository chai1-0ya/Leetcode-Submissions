class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] ans = new int[k];
        Set<Integer> s = new HashSet<>();
        for(int i : arr) s.add(i);
        int i = 1, t = 0;
        while(t<k){
            if(!s.contains(i))
                ans[t++] = i;
            i++;
        }
        // System.out.println(Arrays.toString(ans));
        return ans[k-1];
    }
}