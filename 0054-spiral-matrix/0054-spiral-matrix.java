class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // int i = 0, j = 0, k = 0, l = 0;
        // List<Integer> ls = new ArrayList<>();
        // int m = matrix.length;
        // int n = matrix[0].length;
        // j = m-1;
        // l = n-1;
        // while(i<=j && k<=l){
        //     for(int a = k;a<=l;a++){
        //         ls.add(matrix[i][a]);
        //     }
        //     i++;
        //     for(int a = i;a<=j;a++){
        //         ls.add(matrix[a][l]);
        //     }
        //     l--;
        //     if (i <= j){
        //         for(int a = l;a>=k;a--){
        //             ls.add(matrix[j][a]);
        //         }
        //     }
        //     j--;
        //     if (k <= l){
        //         for(int a = j;a>=i;a--){
        //             ls.add(matrix[a][k]);
        //         }
        //     }
        //     k++;
        // }
        // return ls;
        
        int sr = 0, sc = 0, er = matrix.length-1, ec = matrix[0].length-1;
        List<Integer> ls = new ArrayList<>();
        while(sr<=er && sc<=ec){
            for(int i=sc;i<=ec;i++){
                // System.out.print(matrix[sr][i]+" ");
                ls.add(matrix[sr][i]);
            }
            // System.out.println();
            for(int i=sr+1;i<=er;i++){
                // System.out.print(matrix[i][ec]+" ");
                ls.add(matrix[i][ec]);
            }
            // System.out.println();
            if(sr<er){
                for(int i=ec-1;i>=sc;i--){
                    // System.out.print(matrix[er][i]+" ");
                    ls.add(matrix[er][i]);
                }
            }
            // System.out.println();
            if(sc<ec){
                for(int i=er-1;i>sr;i--){
                    // System.out.print(matrix[i][sc]+" ");
                    ls.add(matrix[i][sc]);
                }
            }
            // System.out.println();
            sr++; sc++; er--; ec--;
        }
        return ls;
    }
    
}