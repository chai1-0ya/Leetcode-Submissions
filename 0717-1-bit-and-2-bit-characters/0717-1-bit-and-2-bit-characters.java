class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if((bits.length==1 || bits.length==2) && bits[0]==1)
            return false;
        int i = 0;
        boolean flag = false;
        while(i<bits.length){
            if(bits[i]==1)
                i+=2;
            else if(bits[i]==0){
                if(i==bits.length-1)
                    flag = true;
                i+=1;
            }
        }
        return flag;
    }
}