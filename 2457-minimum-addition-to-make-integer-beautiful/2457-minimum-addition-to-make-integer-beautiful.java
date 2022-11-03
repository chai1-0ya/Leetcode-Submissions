class Solution {
    
    public long sum(long n){
        long summ = 0;
        while(n != 0){
            summ += n%10;
            n = n/10;
        }
        return summ;
    }
    
    public long makeIntegerBeautiful(long n, int target) {
        if(n <= target)
            return 0;
        // if(n<target)
        //     return 0;
        long x = n;
        long t = 0;
        long summ = 0;
        while(x != 0){
            summ += x%10;
            x = x/10;
            t++;
        }
        if(summ<=target)
            return 0;
        if(t == 1)
            return 10 - (int)n;
        int i = 0;
        x = n;
        while(true){
            if(t>1){
                long z = x - x % 10;
                z = z + 10;
                // System.out.println(z);
                summ = sum(z);
                z = z * (long)Math.pow(10, i);
                // System.out.println(summ);
                if(summ<=target)
                    return z - n;
                x = x / 10;
                i++;
            }
        }
        // return 1111;
    }
}