class Solution {
    
    public static void reverse(int[] array)
    {
  
        // Length of the array
        int n = array.length;
  
        // Swaping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {
  
            // Storing the first half elements temporarily
            int temp = array[i];
  
            // Assigning the first half to the last half
            array[i] = array[n - i - 1];
  
            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
    }
    
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int c = mp.getOrDefault(arr[i],0);
            mp.put(arr[i],c+1);
        }
        int[] a = new int[mp.size()];
        int i = 0;
        for(Map.Entry<Integer,Integer> val : mp.entrySet()){
            a[i++] = val.getValue();
            // System.out.println(val.getKey()+" "+val.getValue());
        }
        Arrays.sort(a);
        reverse(a);
        System.out.println(Arrays.toString(a));
        int t = arr.length/2;
        int c = a[0];
        for(int j=1;j<a.length;j++){
            if(c<t)
                c += a[j];
            else {
                c = j;
                return c;
            }
        }
        return 1;
    }
}