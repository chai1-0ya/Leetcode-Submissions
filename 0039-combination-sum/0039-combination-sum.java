class Solution {
    
    List<List<Integer>> ll = new ArrayList<>();
    
    public void sum(int[] arr, int i, int t, List<Integer> ls){
        if(i==arr.length){
            if(t == 0){
                ll.add(new ArrayList<>(ls));
                // ls.remove(ls.size()-1);
                return ;
            }
            else 
                return ;
        }
        if(t == 0){
            ll.add(new ArrayList<Integer>(ls));
            return;
        }
        if(t>=arr[i]){
            ls.add(arr[i]);
            sum(arr, i, t-arr[i], ls);
            ls.remove(ls.size()-1);
        }
        // else 
        //     return ;
        sum(arr, i+1, t, ls);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ls = new ArrayList<>();
        sum(candidates, 0, target, ls);
        return ll;
    }
}