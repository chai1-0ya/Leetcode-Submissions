class Solution {
    
    List<List<Integer>> ll = new ArrayList<>();
    
    public void sum(int[] arr, int i, int t , List<Integer> l){
        if(t==0){
            // Collections.sort(l);
            ll.add(new ArrayList<>(l));
            return;
        }
        for(int j=i;j<arr.length;j++){
            if(j>i && arr[j]==arr[j-1])
                continue;
            if(arr[j]>t)
                break;
            l.add(arr[j]);
            sum(arr, j+1, t-arr[j], l);
            l.remove(l.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(candidates);
        sum(candidates, 0, target, l);
        // Set<List<Integer>> set = new LinkedHashSet<>();
        // set.addAll(ll);
        // ll.clear();
        // ll.addAll(set);
        return ll;
        
    }
}