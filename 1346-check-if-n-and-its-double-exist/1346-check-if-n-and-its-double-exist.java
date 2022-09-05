class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        // for(int i=0;i<arr.length;++i){
        //     mp.put(arr[i],i);
        // }
        for(int i=0;i<arr.length;++i){
            if(mp.containsKey(2*arr[i]) || (arr[i]%2 == 0 && mp.containsKey(arr[i]/2)))
                return true;
            mp.put(arr[i],i);
        }
        return false;
    }
}