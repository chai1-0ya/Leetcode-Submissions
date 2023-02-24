class Solution {
    public int minOperations(int n) {
        int count =0;
        while(n > 0){
          if((n & 1) == 1){
              count++;
              n /= 2;
              if((n & 1) == 1)
               n++;
          }
          else{
              n /= 2;
          }
      }
      return count; 
    }
}

// class Solution {
//     public int minOperations(int n) {
//         int t = 0;
//         while(n>0){
//             n = n-msb(n);
//             t++;
//             System.out.println(n);
//         }
//         return t-1;
//     }
    
//     public int msb(int n){
//         n |= n >> 1;
//         n |= n >> 2;
//         n |= n >> 4;
//         n |= n >> 8;
//         n |= n >> 16;
//         n = n + 1;
//         n = n >> 1;
//         return n;
//     }
// }