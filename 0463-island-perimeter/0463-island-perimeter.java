class Pair{
    int first;
    int second;
    Pair(int f, int s){
        this.first = f;
        this.second = s;
    }
}

class Solution {
    
    int ans = 0;
    
    boolean isValid(int i, int j, int n, int m){
        return i>=0 && j>=0 && i<n && j<m;
    }
    
    void bfs(int n, int m, int i, int j, int[][] grid, int[][] vis){
        int[][] mov = {{-1,0},{0,1},{1,0},{0,-1}};
        vis[i][j] = 1;
        // ans = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        while(!q.isEmpty()){
            Pair p = q.poll();
            for(int[] temp:mov){
                int x=p.first+temp[0], y=p.second+temp[1];
                if(isValid(x,y,n,m) && grid[x][y]==0) ans++;
                if(!isValid(x,y,n,m)) ans++;
            }
            for(int[] temp : mov){
                int x = p.first+temp[0], y = p.second+temp[1];
                if(isValid(x,y,n,m) && vis[x][y]==0 && grid[x][y]==1){
                    q.add(new Pair(x,y));
                    vis[x][y] = 1;
                }
            }
        }
    }
    
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
          int[][] vis = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]==1)
                    bfs(n,m,i,j,grid,vis);
            }
        }
        return ans;
    }
}