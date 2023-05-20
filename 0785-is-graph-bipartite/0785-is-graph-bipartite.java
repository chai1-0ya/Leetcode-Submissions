class Solution {
    
    public boolean bfs(int[][] adj, int node, int[] vis){
        Queue<Integer> q = new LinkedList<>();
        vis[node] = 1;
        q.add(node);
        while(!q.isEmpty()){
            int t = q.poll();
            for(int i : adj[t]){
                if(vis[i]==0){
                    q.add(i);
                    vis[i] = -vis[t];
                }
                else{
                    if(vis[i]==vis[t])
                        return false;
                }
            }
        }
        return true;
    }
    
    public boolean isBipartite(int[][] graph) {
        int[] vis = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(vis[i]==0)
                if(!bfs(graph, i, vis))
                    return false;
        }
        return true;
    }
}