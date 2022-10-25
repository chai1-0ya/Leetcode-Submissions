class Solution {
    
    List<List<String>> ll = new ArrayList<>();
    
    public boolean safe(int row, int col, char[][] board){
        int m = row;
        int n = col;
        while(m>=0 && n>=0){
            if(board[m][n] == 'Q')
                return false;
            m--;
            n--;
        }
        n = col;
        while(n>=0){
            if(board[row][n] == 'Q')
                return false;
            n--;
        }
        m = row;
        n = col;
        while(m<board.length && n>=0){
            if(board[m][n] == 'Q')
                return false;
            m++;
            n--;
        }
        return true;
    }
    
    public void xyz(int col, char[][] board, int n){
        if(col == n){
            ll.add(construct(board));
            return;
        }
        for(int i=0;i<n;i++){
            if(safe(i, col, board)){
                board[i][col] = 'Q';
                xyz(col+1, board, n);
                board[i][col] = '.';
            }
        }
    }
    
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        xyz(0, board, n);
        // System.out.println(board);
        return ll;
    }
    
    public List<String> construct(char[][] board){
        List<String> res = new LinkedList<String>();
        for(int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}