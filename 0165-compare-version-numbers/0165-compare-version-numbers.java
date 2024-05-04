class Solution {
    public int compareVersion(String v1, String v2) {
        String[] ver1 = v1.split("[.]");
        String[] ver2 = v2.split("[.]");
        int i=0, j=0;
        while(i<ver1.length || i<ver2.length){
            int a,b;
            if(i>=ver1.length)
                a = 0;
            else a = Integer.parseInt(ver1[i]);
            
            if(i>=ver2.length)
                b = 0;
            else b = Integer.parseInt(ver2[i]);
            
            if(a<b) return -1;
            else if(a>b) return 1;
            
            i++;
        }
        return 0;
    }
}