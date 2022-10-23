class Solution {
    
    List<List<Integer>> ll = new ArrayList<>();
    
    public void subset(int[] arr, int i, List<Integer> l){
        if(i>=arr.length){
            // ll.add(new ArrayList<Integer>(l));
            return;
        }
        for(int j=i;j<arr.length;j++){
            if(j>i && arr[j]==arr[j-1])
                continue;
            l.add(arr[j]);
            ll.add(new ArrayList<Integer>(l));
            subset(arr, j+1, l);
            l.remove(l.size()-1);
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        subset(nums, 0, l);
        ll.add(new ArrayList<Integer>());
        return ll;
    }
}