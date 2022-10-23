class Solution {
    
    List<List<Integer>> ll = new ArrayList<>();
    
    public void prem(int[] arr, boolean[] visit, List<Integer> l){
        if(l.size()==arr.length){
            ll.add(new ArrayList(l));
            return;
        }
        for(int j=0;j<arr.length;j++){
            if(visit[j] == false){
                l.add(arr[j]);
                visit[j] = true;
                prem(arr, visit, l);
                visit[j] = false;
                l.remove(l.size()-1);
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        // Map<Integer,Character> mp = new HashMap<>();
        boolean[] visit = new boolean[nums.length];
        List<Integer> l = new ArrayList<>();
        // for(int a : nums)
        //     mp.put(a, 'f');
        prem(nums, visit, l);
        return ll;
    }
}