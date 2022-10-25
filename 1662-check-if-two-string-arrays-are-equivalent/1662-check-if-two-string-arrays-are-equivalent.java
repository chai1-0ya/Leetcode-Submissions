class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "", b = "";
        for(int i=0;i<word1.length;i++)
            a+=word1[i];
        for(int i=0;i<word2.length;i++)
            b+=word2[i];
        // a = Arrays.toString(word1);
        // b = Arrays.toString(word2);
        if(a.equals(b))
            return true;
        // System.out.println(Arrays.toString(word1));
        return false;
    }
}