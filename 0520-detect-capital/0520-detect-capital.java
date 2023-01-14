class Solution {
    public boolean detectCapitalUse(String word) {
        int k=0;
        if(word.length()<2){
                return true;
        }
        if(word.charAt(0)<91 && word.charAt(1)<91){
            for(int i=2;i<word.length() && word.charAt(i)<91;i++)
                k++;
            if(k==(word.length()-2))
                return true;
        }
        else if(word.charAt(0)<91 && word.charAt(1)>96){
            for(int i=2;i<word.length() && word.charAt(i)>96;i++)
                k++;
            if(k==(word.length()-2))
                return true;
        }
        else if(word.charAt(0)>96){
            for(int i=1;i<word.length() && word.charAt(i)>96;i++)
                k++;
            if(k==(word.length()-1))
                return true;
        }
        return false;
    }
}