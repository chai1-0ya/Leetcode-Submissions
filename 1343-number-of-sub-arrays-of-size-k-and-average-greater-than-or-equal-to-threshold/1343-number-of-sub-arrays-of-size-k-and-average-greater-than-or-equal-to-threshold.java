class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int t = 0;
        int i = 0, j = k-1;
        while(j<arr.length){
            int avg = 0;
            for(int l=i;l<=j;l++)
                avg += arr[l];
            avg = avg/k;
            if(avg>=threshold)
                t++;
            j++; i++;
        }
        return t;
    }
}