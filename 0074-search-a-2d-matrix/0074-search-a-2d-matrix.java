class Solution {
    
    
    public boolean b_search(int[] arr, int start, int end, int t){
        if(start>end)
            return false;
        int mid = start+(end-start) / 2;
        if(arr[mid] == t)
            return true;
        if(t < arr[mid])
            return b_search(arr, start, mid-1, t);
        if(t > arr[mid])
            return b_search(arr, mid+1, end, t);
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            if(target<=matrix[i][n-1]){
                return b_search(matrix[i], 0, n-1, target);
            }
        }
        return false;
    }
}