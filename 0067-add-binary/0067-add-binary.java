class Solution {
    public String addBinary(String a, String b) {
        return add(a,b);
        
    }
    
    public String add(String a, String b){
        int m = a.length()-1;
        int n = b.length()-1;
        int c = 0;
        String s = "";
        for(int i=0;i<a.length() && i<b.length();i++){
            if(a.charAt(m)== '1' && b.charAt(n) == '1'){
                if(c==1)
                    s = '1'+s;
                else if(c==0)
                    s = '0'+s;
                c = 1;
            }
            else if(a.charAt(m)=='0' && b.charAt(n)=='0'){
                if(c==1){
                    s = '1'+s;
                    c = 0;
                }
                else if(c==0)
                    s = '0'+s;
            }
            else{
                if(c==1)
                    s = '0'+s;
                else if(c==0)
                    s = '1'+s;
            }
            m--; n--;
            // System.out.println(m+" "+n);
        }
        while(m>=0){
            if(c==1){
                if(a.charAt(m)=='0'){
                    s = '1'+s;
                    c = 0;
                }
                else if(a.charAt(m)=='1'){
                    s = '0'+s;
                }
            }
            else if(c==0){
                s = a.charAt(m)+s;
            }
            m--;
        }
        while(n>=0){
            if(c==1){
                if(b.charAt(n)=='0'){
                    s = '1'+s;
                    c = 0;
                }
                else if(b.charAt(n)=='1'){
                    s = '0'+s;
                }
            }
            else if(c==0){
                s = b.charAt(n)+s;
            }
            n--;
        }
        if(c==1)
            s = '1'+s;
        
        return s;
    }
}