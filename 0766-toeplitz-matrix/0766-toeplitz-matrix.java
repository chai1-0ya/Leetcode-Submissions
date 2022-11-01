class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int r=0; r<matrix.length;r++) {
            for(int c=0; c<matrix[0].length;c++) {
                if(!mp.containsKey(r-c))
                    mp.put(r-c, matrix[r][c]);
                else if(mp.get(r-c) != matrix[r][c])
                    return false;
            }
        }
        return true;
    }
}