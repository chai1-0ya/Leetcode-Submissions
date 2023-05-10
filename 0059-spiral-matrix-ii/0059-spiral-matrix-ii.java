class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int x = 1;
        int sr = 0, sc = 0, er = n-1, ec = n-1;
        while(sr <= er || sc <= ec){
            for(int i=sc;i<=ec;i++){
                mat[sr][i] = (x++);
            }
            for(int i=sr+1;i<=er;i++){
                mat[i][ec] = (x++);
            }
            for(int i=ec-1;i>=sc;i--){
                mat[er][i] = (x++);
            }
            for(int i=er-1;i>sr;i--){
                mat[i][sc] = (x++);
            }
            sr++; sc++; er--; ec--;
        }
        return mat;
    }
}