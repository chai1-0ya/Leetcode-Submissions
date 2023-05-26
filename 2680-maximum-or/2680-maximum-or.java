class Solution {
    
    public static long maxOR(int arr[], int n,
                                  int k, int x)
    {
        long preSum[] = new long[n + 1];
        long suffSum[] = new long[n + 1];
        long res = 0, pow = 1;
 
        // Compute x^k
        for (int i = 0; i < k; i++)
            pow *= x;
 
        // Find prefix bitwise OR
        preSum[0] = 0;
        for (int i = 0; i < n; i++)
            preSum[i + 1] = preSum[i] | arr[i];
 
        // Find suffix bitwise OR
        suffSum[n] = 0;
        for (int i = n - 1; i >= 0; i--)
            suffSum[i] = suffSum[i + 1] | arr[i];
 
        // Find maximum OR value
        res = 0;
        for (int i = 0; i < n; i++)
            res = Math.max(res, preSum[i] |
                (arr[i] * pow) | suffSum[i + 1]);
 
        return res;
    }
 
    // Drivers code
//     public static void main(String args[])
//     {
//         long arr[] = { 1, 2, 4, 8 };
//         int n = 4;
//         int k = 2, x = 3;
         
//         long ans = maxOR(arr, n, k, x);
//         System.out.println(ans);
//     }
    
    public long maximumOr(int[] nums, int k) {
        // long arr[] = { 1, 2, 4, 8 };
        int n = nums.length;
        // int k = 2, x = 3;
         
        long ans = maxOR(nums, n, k, 2);
        return ans;
    }
}