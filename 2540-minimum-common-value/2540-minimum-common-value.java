class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length)
            return getCommon(nums2, nums1);
        
        for(int i : nums1){
            if(bSearch(i, nums2))
                return i;
        }
        return -1;
    }
    
    public boolean bSearch(int n, int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>n)
                high = mid-1;
            else if(arr[mid]<n)
                low = mid+1;
            else 
                return true;
        }
        return false;
    }
    
}