class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int ans = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = s.charAt(i)-'0';
        int[] suff = new int[n];
        suff[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--) suff[i] = arr[i]+suff[i+1];
        int zero = 0;
        for(int i=0;i<n-1;i++){
            // if(arr[i]==1) zero = 0;
            if(arr[i] == 0)
                zero++;
            ans = Math.max(zero+suff[i]-arr[i], ans);
            // System.out.println(zero+" "+ans);
        }
        if(zero==n)
            return ans-1;
        // System.out.println(Arrays.toString(suff));
        return ans;
    }
}