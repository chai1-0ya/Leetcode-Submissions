class Solution {
    
    List<List<Integer>> adj = new ArrayList<>();
    int[] flower;
    
    public boolean possible(int j, int[] arr, int i){
        for(int a : adj.get(i)){
            if(arr[a] == j)
                return false;
        }
        return true;
    }
    
    public boolean path(int n, int i, int[] arr){
        if(i==n)
            return true;
        for(int j=1;j<5;j++){
            if(possible(j, arr, i)){
                arr[i] = j;
                if(path(n, i+1, arr))
                    return true;
                arr[i] = 0;
            }
        }
        return false;
    }
    
    public int[] gardenNoAdj(int n, int[][] paths) {
        flower = new int[n];
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<paths.length;i++){
            adj.get(paths[i][0]-1).add(paths[i][1]-1);
            adj.get(paths[i][1]-1).add(paths[i][0]-1);
        }
        path(n, 0, flower);
        return flower;
    }
}