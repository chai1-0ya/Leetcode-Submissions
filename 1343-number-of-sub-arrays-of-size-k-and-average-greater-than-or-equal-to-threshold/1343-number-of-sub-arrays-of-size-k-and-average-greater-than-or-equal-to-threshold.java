class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int t = 0;
        int sum = 0;
        int avg = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
            avg = sum/k;
        }
        if(avg>=threshold)
            t++;
        for(int i=k;i<arr.length;i++){
            sum = sum + arr[i] - arr[i-k];
            avg = sum/k;
            if(avg>=threshold)
                t++;
        }
        return t;
    }
}