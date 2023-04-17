class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int h = numbers.length-1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[l]+numbers[h]==target)
                return new int[] {++l, ++h};
            else if(numbers[l]+numbers[h]>target)
                h--;
            else
                l++;
        }
        return new int[] {-1,-1};
    }
}