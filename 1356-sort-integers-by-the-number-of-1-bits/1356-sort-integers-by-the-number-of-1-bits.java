class Solution {
    private int setbits(int a){
        int res = 0;
        while(a>0){
            res++;
            a&=(a-1);
        }
        return res;
    }
    
    public int[] sortByBits(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Comparator<Integer> compbybits = (n1, n2)->{
            if(setbits(n1)==setbits(n2))
                    return n1-n2;
                return setbits(n1)-setbits(n2);
        };
        
        Arrays.sort(arr, compbybits);
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++) ans[i] = arr[i];
        return ans;
    }
}