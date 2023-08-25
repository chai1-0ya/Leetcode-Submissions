class Pair{
    int first;
    int second;
    Pair(int fst,int scnd){
        this.first=fst;
        this.second=scnd;
    }
}

class Solution {
    int count = 0;
    
    boolean isValid(int i, int j, int n, int m){
        return i>=0 && j>=0 && i<n && j<m;
    }
    
    public void bfs(int[][] grid, int[][] vis, int i, int j, int n, int m){
        int[][] mov = {{-1,0},{0,1},{1,0},{0,-1}};
        vis[i][j] = 1;
        int ans = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        while(!q.isEmpty()){
            Pair p = q.poll(); 
            for(int[] a : mov){
                int x = p.first+a[0], y = p.second+a[1];
                if(isValid(x,y,n,m) && vis[x][y]==0 && grid[x][y]==1){
                    q.add(new Pair(x,y));
                    vis[x][y] = 1;
                    ans++;
                }
            }
            // ans++;
        }
        count = Math.max(count,ans);
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]==1){
                    bfs(grid,vis,i,j,n,m);
                }
            }
        }
        return count;
    }
}