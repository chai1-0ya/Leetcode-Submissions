class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int length = nums.length;
        int start = 0;
        int end = length-1;
        int[] square = new int[length];
        int current = length -1;
        while(start<=end) {
            int startsq = nums[start]*nums[start];
            int endsq = nums[end]*nums[end];
            if(startsq>endsq) {
                square[current] = startsq;
                start++;
            }
            else {
                square[current] = endsq;
                end--;
            }
            current--;
        }
        return square;
    }
}