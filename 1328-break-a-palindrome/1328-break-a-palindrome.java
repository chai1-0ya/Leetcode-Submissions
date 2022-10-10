class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        String s = "";
        boolean flag = false;
        if(n==1)
            return "";
        if(n%2==0){
            for(int i=0;i<n;i++){
                if(palindrome.charAt(i)!='a' && flag == false){
                    flag = true;
                    s += 'a';
                }
                else
                    s += palindrome.charAt(i);
            }
        }
        else{
            for(int i=0;i<n/2;i++){
                if(palindrome.charAt(i)!='a' && flag == false){
                    flag = true;
                    s += 'a';
                }
                else
                    s += palindrome.charAt(i);
            }
            for(int i=n/2;i<n;i++)
                s += palindrome.charAt(i);
        }
        if(flag==false){
                s = ""+'b';
                s = palindrome.substring(0, (n-1))+s;
            }
        return s;    
    }
}