class Solution {
    public int[] replaceElements(int[] arr) {
        int max = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                max = Math.max(max,arr[j]);
            }
            arr[i] = max;
            max = 0;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}