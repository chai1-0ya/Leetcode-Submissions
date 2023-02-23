class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int t = 0;
        double sum = 0;
        double avg = 0;
        double max = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum += arr[i];

        }
        avg = (sum/k);
        max = Math.max(avg, max);
        for(int i=k;i<arr.length;i++){
            sum = sum + arr[i] - arr[i-k];
            avg = (sum/k);
            max = Math.max(avg, max);
        }
        return max;
    }
}