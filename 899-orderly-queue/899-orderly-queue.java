class Solution {
    public String orderlyQueue(String s, int k) {
        String sa = s, sb = s;
        int n = s.length();
        if(k==1){
            for(int i=0;i<n-1;i++){
                char c = sa.charAt(0);
                sa = sa+c;
                sa = sa.substring(1,n+1);
                if(sa.compareTo(sb) < 0)
                    sb = sa; 
            }
        }
        else{
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            sb = "";
            for(int i=0;i<n;i++)
                sb += arr[i];
        }
        return sb;
    }
}