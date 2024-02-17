class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums, mid, high);
                high--;
            }
            else 
                mid++;
            // System.out.println(Arrays.toString(nums)+" "+mid);
        }
    }
    
    public void swap(int[] arr, int x, int y){
        int t = arr[x];
        arr[x] = arr[y];
        arr[y] = t;
    }
}