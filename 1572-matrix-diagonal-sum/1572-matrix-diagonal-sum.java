class Solution {
    public int diagonalSum(int[][] mat) {
        int ans = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j){
                    ans += mat[i][j];
                    // System.out.println(mat[i][j]);
                }
                else if(i+j==(mat.length-1)){
                    ans += mat[i][j];
                    // System.out.println(mat[i][j]);
                }
            }
        }
        return ans;
        
    }
}