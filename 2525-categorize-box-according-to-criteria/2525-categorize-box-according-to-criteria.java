class Solution {
    public String categorizeBox(int l, int w, int h, int m) {
        long v = (long)l*w*h;
        System.out.println(v);
        if(l>=10000 || w>=10000 || h>=10000 || v>=1000000000){
            if(m>=100) 
                return "Both";
            return "Bulky";
        }
        else if(m>=100)
            return "Heavy";
        else
            return "Neither";
    }
}