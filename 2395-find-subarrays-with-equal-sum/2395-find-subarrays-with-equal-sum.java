class Solution {
    public boolean findSubarrays(int[] a) {
    
        if(a.length<=2)
            return(false);
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<a.length-1;i++)
        {
            int s=a[i]+a[i+1];
            if(h.add(s)==false)
                return(true);
        }
        return(false);
        
    }
}