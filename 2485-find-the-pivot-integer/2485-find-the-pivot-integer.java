class Solution {
    public int pivotInteger(int n) {
        int x = 0;
        for(int i=n;i>0;i--){
            int sum = (i*(i+1))/2;
            // System.out.println(sum);
            x += i;
            if(sum == x)
                return i;
        }
        return -1;
    }
}