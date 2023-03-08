class Solution {
    
    public long minimumTime(int[] time, int totalTrips) {
        long l = 1;
        long h = (long)10000000*totalTrips;
        while(l<h){
            long mid = (l + h)/2;
            long count = trips(mid, time);
            // System.out.println(mid+" "+count);
            if(count<totalTrips)
                l = mid+1;
            else 
                h = mid;
        }
        return l;
    }
    
    public long trips(long mid, int[] time){
        long count = 0;
        for(int i=0;i<time.length;i++){
            count += mid/time[i];
        }
        return count;
    }
}