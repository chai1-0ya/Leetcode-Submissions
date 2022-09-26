import java.util.*;
class Solution {
    public int numDifferentIntegers(String word) {
        
        String s="abcdefghijklmnopqrstuvwxyz";
        StringTokenizer str=new StringTokenizer(word,s);
        
        HashSet<String> h=new HashSet<>();
        while(str.hasMoreTokens())
        {
            String n=(str.nextToken());
            int i = 0, x = n.length();
            System.out.print(n+" ");
            while(i<x){
                if(n.charAt(i) != '0'){
                    n = n.substring(i);
                    break;
                }
                i++;
            }
            if(i==x)
                  n = "0";
            System.out.println(n);
            h.add(n);
        }
        return(h.size());
        
    }
}