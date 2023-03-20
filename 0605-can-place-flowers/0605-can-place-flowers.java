class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0,b=0,f=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i] == 0){
                if(i==0 || flowerbed[i-1]==0)
                    b=0;
                else  
                    b=1;  
                if(i == flowerbed.length-1 || flowerbed[i+1]==0)
                    f=0;
                else
                    f=1;  
                if(b==0 && f==0){
                    c++;
                    flowerbed[i]=1;
                }
            }
        }
        return (c>=n);
    }
}