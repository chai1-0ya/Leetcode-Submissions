class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int[] arr = new int[s.size()];
        int x = 0;
        for(int i : s){
            arr[x++] = i;
        }
        Arrays.sort(arr); 
        // System.out.println(Arrays.toString(arr));
        if(arr.length<3)
            return arr[arr.length-1];
        else if(s.size()<3)
            return arr[s.size()-1];
        else{
            return arr[s.size()-3];
        }
    }
}